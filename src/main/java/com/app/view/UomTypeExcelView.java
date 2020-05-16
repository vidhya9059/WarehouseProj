package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.UomType;

public class UomTypeExcelView extends AbstractXlsxView {

	@Override
	public void buildExcelDocument(Map<String, Object> model,Workbook book, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		resp.addHeader("content-Disposition", "attachement;filename=UomTypes.xlsx");
		//read data
		List<UomType> list=(List<UomType>)model.get("list");
		//create new sheet
		Sheet sheet=book.createSheet("UomTypes");
		addHeader(sheet);
		addBody(sheet,list);
	}


	private void addHeader(Sheet sheet) {
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("TYPE");
		row.createCell(2).setCellValue("MODEL");
		row.createCell(3).setCellValue("DESCRIPTION");
	}
	private void addBody(Sheet sheet, List<UomType> list) {

		int rowNum=1;
		for(UomType u:list) {
			Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(u.getId());
			row.createCell(1).setCellValue(u.getUomtype());
			row.createCell(2).setCellValue(u.getUommodel());
			row.createCell(3).setCellValue(u.getDescreption());




		}
	}



}
