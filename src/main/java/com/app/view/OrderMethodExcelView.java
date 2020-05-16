package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.OrderMethod;


public class OrderMethodExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook book, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {

		
		
		resp.addHeader("content-Disposition", "attachement;filename=OrderMethods.xlsx");
		//read data
		List<OrderMethod> list=(List<OrderMethod>)model.get("list");
		//create new sheet
		Sheet sheet=book.createSheet("OrderMethods");
		addHeader(sheet);
		addBody(sheet,list);
	}


	private void addHeader(Sheet sheet) {
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("MODE");
		row.createCell(2).setCellValue("CODE");
		row.createCell(3).setCellValue("TYPE");
		row.createCell(4).setCellValue("ACCEPT");
		row.createCell(5).setCellValue("NOTE");
	
	}
	private void addBody(Sheet sheet, List<OrderMethod> list) {

		int rowNum=1;
		for(OrderMethod omd:list) {
			Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(omd.getId());
			row.createCell(1).setCellValue(omd.getOrderMode());
			row.createCell(2).setCellValue(omd.getOrderCode());
			row.createCell(3).setCellValue(omd.getOrderType());
			row.createCell(4).setCellValue(omd.getOrderAccept().toString());
			row.createCell(5).setCellValue(omd.getDescription());


		}
	}

	}


