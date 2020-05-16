package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.UomType;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class UomTypePdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest req, HttpServletResponse resp) throws Exception {
     resp.addHeader("Content-Disposition", "attachment;filename=UomTypes.pdf");
     Paragraph p=new Paragraph("welcome to uom type data");
     document.add(p);
     List<UomType> uoms=(List<UomType>)model.get("list");
     PdfPTable table=new PdfPTable(4);
     table.addCell("ID");
     table.addCell("TYPE");
     table.addCell("MODEL");
     table.addCell("DESCRIPTION");
     for(UomType u:uoms) {
    	 table.addCell(u.getId().toString());
         table.addCell(u.getUomtype());
         table.addCell(u.getUommodel());
         table.addCell(u.getDescreption());
         
     }
     document.add(table);
     document.add(new Paragraph(new Date().toString()));
     
     
	}

}
