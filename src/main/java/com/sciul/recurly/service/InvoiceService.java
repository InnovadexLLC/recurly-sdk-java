/**
 * 
 */
package com.sciul.recurly.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.model.Invoice;

/**
 * @author GauravChawla
 * 
 */
@Service
public class InvoiceService extends AbstractService {

  /** The logger. */
  private static Logger logger = LoggerFactory.getLogger(InvoiceService.class);

  @Override
  public Logger getLogger() {
    return logger;
  }

  // private HttpHeaders getRecurlyHeaders() throws UnsupportedEncodingException {
  // logger.debug("Setting custom header for PDF file.");
  // HttpHeaders headers = recurly.getRecurlyHeaders();
  // headers.set("Accept", "application/pdf");
  // return headers;
  // }

  public Invoice getInvoice(String invoiceNumber) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.V2INVOICES.toString() + "/" + invoiceNumber, null, Invoice.class,
          HttpMethod.GET);
  }
}
