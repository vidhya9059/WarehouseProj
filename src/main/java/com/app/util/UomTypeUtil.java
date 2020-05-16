package com.app.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class UomTypeUtil {
	public void generatePie(String path,List<Object[]> list) {
		//1.create dataset
		DefaultPieDataset dataset=new DefaultPieDataset();
		for(Object[] ob:list) {
			dataset.setValue(ob[0].toString(),new Double(ob[1].toString()));
		}
		//2.create JFreeChart object
		JFreeChart chart=ChartFactory.createPieChart3D("UOMTYPE PIE CHART", dataset);
		try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/UomTypePie.jpg"), chart, 400, 400 );
		} catch (IOException e) {
			e.printStackTrace();
		}
	   
	}
	 public void generateBar(String path,List<Object[]> list) {
		 //create dataset
		 DefaultCategoryDataset dataset=new DefaultCategoryDataset();
		 for(Object[] ob:list) {
			 dataset.setValue(new Double(ob[1].toString()), ob[1].toString(), ob[1].toString());
			 
		 }
		 //create jfreechart
		 JFreeChart chart=ChartFactory.createBarChart("UOMTYPE BAR CHART", "UomTypes","Count", dataset);
		 //save as image
		 
		 try {
			ChartUtils.saveChartAsJPEG(new File(path+"/resources/images/UomTypeBar.jpg"), chart,400,400 );
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
		
}
