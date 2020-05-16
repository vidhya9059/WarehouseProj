package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.app.model.WhUserType;

public class WhUserTypeExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook book, HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		resp.addHeader("content-Disposition", "attachement;filename=WhUserTypes.xlsx");
		//read data
		List<WhUserType> list=(List<WhUserType>)model.get("list");
		//create new sheet
		Sheet sheet=book.createSheet("WhUserTypes");
		addHeader(sheet);
		addBody(sheet,list);
	}


	private void addHeader(Sheet sheet) {
		Row row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("UTYPE");
		row.createCell(2).setCellValue("UCODE");
		row.createCell(3).setCellValue("USERFOR");
		row.createCell(4).setCellValue("UEMAIL");
		row.createCell(5).setCellValue("UCONTACT");
		row.createCell(6).setCellValue("UIDTYPE");
		row.createCell(7).setCellValue("UIDOTHER");
		row.createCell(8).setCellValue("UIDNUMBER");
	}
	private void addBody(Sheet sheet, List<WhUserType> list) {
		int rowNum=1;
		for(WhUserType wut:list) {
			Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(wut.getId());
			row.createCell(1).setCellValue(wut.getUserType());
			row.createCell(2).setCellValue(wut.getUserCode());
			row.createCell(3).setCellValue(wut.getUserFor());
			row.createCell(4).setCellValue(wut.getUserEmail());
			row.createCell(5).setCellValue(wut.getUserContact());
			row.createCell(3).setCellValue(wut.getUserIdType());
			row.createCell(4).setCellValue(wut.getIfOther());
			row.createCell(5).setCellValue(wut.getIdNumber());


		}

	}

}
