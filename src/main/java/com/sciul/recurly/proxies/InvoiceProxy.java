/**
 * 
 */
package com.sciul.recurly.proxies;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;

import com.sciul.recurly.config.RecurlyConfiguration;
import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;
import com.sciul.recurly.model.Invoice;

/**
 * The Class InvoiceProxy.
 * 
 * @author GauravChawla
 */
public class InvoiceProxy extends AbstractProxy {

  /**
   * Instantiates a new invoice proxy.
   * 
   * @param recurly
   *          the recurly
   */
  InvoiceProxy(RecurlyConfiguration recurly) {
    super(recurly);
  }

  /** The logger. */
  private static Logger logger = LoggerFactory.getLogger(InvoiceProxy.class);

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

  /**
   * Gets the invoice.
   * 
   * @param invoiceNumber
   *          the invoice number
   * @return the invoice
   * @throws RecurlyException
   *           the recurly exception
   */
  public Invoice getInvoice(String invoiceNumber) throws RecurlyException {
    return call(BillingConstants.RecurlyApiPath.V2INVOICES.toString() + "/" + invoiceNumber, null, Invoice.class,
          HttpMethod.GET);
  }
}
