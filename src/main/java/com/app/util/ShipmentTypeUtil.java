package com.app.util;

import java.io.File;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class ShipmentTypeUtil {
  public void generatePie(String path,List<Object[]> list) {
	  //create dataset
	  DefaultPieDataset dataset=new DefaultPieDataset();
	  for(Object[] ob:list) {
		  dataset.setValue(ob[0].toString(),new Double(ob[1].toString()));
	  }
	  //2.create jfree object
	  JFreeChart chart=ChartFactory.createPieChart3D("SHIPMENTMODE PIECHART", dataset);
	  //save as image
	  try {
		  ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/ShipmentModePie.jpg"), chart, 400,400);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	  
  }
}
