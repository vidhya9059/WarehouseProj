package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.OrderMethod;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class OrderMethodPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest req, HttpServletResponse resp) throws Exception {
		resp.addHeader("content-Disposition", "attachement;filename=OrderMethods.pdf");
		
		Paragraph p=new Paragraph("welcome to Order method data");
		document.add(p);
		List<OrderMethod> omds=(List<OrderMethod>)model.get("list");
		PdfPTable table=new PdfPTable(6);
		table.addCell("ID");
		table.addCell("MODE");
		table.addCell("CODE");
		table.addCell("TYPE");
		table.addCell("ACCEPT");
		table.addCell("NOTE");
		for(OrderMethod om:omds) {
			table.addCell(om.getId().toString());
			table.addCell(om.getOrderMode());
			table.addCell(om.getOrderCode());
			table.addCell(om.getOrderType());
			table.addCell(om.getOrderAccept().toString());
			table.addCell(om.getDescription());
		}
		document.add(table);
		document.add(new Paragraph(new Date().toString()));
		p=new Paragraph("*This is computer generated table");
		document.add(p);
	}
}
