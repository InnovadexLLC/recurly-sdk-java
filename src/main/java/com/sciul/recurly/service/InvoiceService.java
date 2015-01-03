/**
 * 
 */
package com.sciul.recurly.service;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import com.sciul.recurly.exception.RecurlyException;
import com.sciul.recurly.helper.BillingConstants;

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

  private HttpHeaders getRecurlyHeaders() throws UnsupportedEncodingException {
    logger.debug("Setting custom header for PDF file.");
    HttpHeaders headers = recurly.getRecurlyHeaders();
    headers.set("Accept", "application/pdf");
    return headers;
  }

  public byte[] getInvoice(String invoiceNumber) throws RecurlyException {
    try {
      return call(BillingConstants.RecurlyApiPath.V2INVOICES.toString() + "/" + invoiceNumber, null, byte[].class,
            HttpMethod.GET, getRecurlyHeaders());
    } catch (UnsupportedEncodingException e) {
      throw new RecurlyException("Failed while getting invoice copy", e);
    }
  }

}
