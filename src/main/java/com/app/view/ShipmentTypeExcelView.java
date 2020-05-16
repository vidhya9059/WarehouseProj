package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.ShipmentType;


public class ShipmentTypeExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook book, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {

		
		
		
		
		resp.addHeader("content-Disposition", "attachement;filename=ShipmentTypes.xlsx");
		//read data
		List<ShipmentType> list=(List<ShipmentType>)model.get("list");
		//create new sheet
		Sheet sheet=book.createSheet("ShipmentTypes");
		addHeader(sheet);
		addBody(sheet,list);
	}


	private void addHeader(Sheet sheet) {
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("SMODE");
		row.createCell(2).setCellValue("SCODE");
		row.createCell(3).setCellValue("ENBSHIP");
		row.createCell(4).setCellValue("SGRADE");
		row.createCell(5).setCellValue("DESCRIPTION");
	
	}
	private void addBody(Sheet sheet, List<ShipmentType> list) {

		int rowNum=1;
		for(ShipmentType st:list) {
			Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(st.getId());
			row.createCell(1).setCellValue(st.getShipmentMode());
			row.createCell(2).setCellValue(st.getShipmentCode());
			row.createCell(3).setCellValue(st.getEnableShipment());
			row.createCell(4).setCellValue(st.getShipmentGrade());
			row.createCell(5).setCellValue(st.getDesription());


		}
	}
	}


