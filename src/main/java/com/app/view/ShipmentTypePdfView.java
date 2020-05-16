package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.ShipmentType;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ShipmentTypePdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest req, HttpServletResponse resp) throws Exception {
		resp.addHeader("content-Disposition", "attachement;filename=ShipmentTypes.pdf");
		
		Paragraph p=new Paragraph("welcome to shipment type data");
	     document.add(p);
	     
		
		
		
		List<ShipmentType> shipments=(List<ShipmentType>)model.get("list");
		PdfPTable table=new PdfPTable(6);
		table.addCell("ID");
		table.addCell("SMODE");
		table.addCell("SCODE");
		table.addCell("ENBSHIP");
		table.addCell("SGRADE");
		table.addCell("DESCRIPTION");
		for(ShipmentType st:shipments) {
			table.addCell(st.getId().toString());
			table.addCell(st.getShipmentMode());
			table.addCell(st.getShipmentCode());
			table.addCell(st.getEnableShipment());
			table.addCell(st.getShipmentGrade());
			table.addCell(st.getDesription());
			}

	     document.add(table);
	     document.add(new Paragraph(new Date().toString()));
	     
		
		   
	}

}
