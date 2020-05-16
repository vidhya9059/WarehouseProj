package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;
import com.app.model.WhUserType;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class WhUserTypePdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest req, HttpServletResponse resp) throws Exception {
resp.addHeader("content-Disposition", "attachement;filename=WhUserTypes.pdf");
		
		Paragraph p=new Paragraph("welcome to Order method data");
		document.add(p);
		List<WhUserType> usertypes=(List<WhUserType>)model.get("list");
		PdfPTable table=new PdfPTable(9);
		table.addCell("ID");
		table.addCell("UTYPE");
		table.addCell("UCODE");
		table.addCell("USERFOR");
		table.addCell("UEMAIL");
		table.addCell("UCONTACT");
		table.addCell("UIDTYPE");
		table.addCell("UIDOTHER");
		table.addCell("UIDNUMBER");
         for(WhUserType wut:usertypes) {
        	 table.addCell(wut.getId().toString());
     		table.addCell(wut.getUserType());
     		table.addCell(wut.getUserCode());
     		table.addCell(wut.getUserFor());
     		table.addCell(wut.getUserEmail());
     		table.addCell(wut.getUserContact());
     		table.addCell(wut.getUserIdType());
     		table.addCell(wut.getIfOther());
     		table.addCell(wut.getIdNumber());
             }
         document.add(table);
 		document.add(new Paragraph(new Date().toString()));
 		p=new Paragraph("*This is computer generated table");
 		document.add(p);
 	
	}

}
