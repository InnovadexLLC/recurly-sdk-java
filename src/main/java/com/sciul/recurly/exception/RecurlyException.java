package com.sciul.recurly.exception;

import com.sciul.recurly.model.RecurlyErrors;

/**
 * The Class RecurlyException.
 * 
 * @author GauravChawla
 */
public class RecurlyException extends Exception {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -7345365257887387856L;

  /** The code. */
  private Integer code;

  /** The recurly errors. */
  private RecurlyErrors recurlyErrors;

  /**
   * Instantiates a new recurly exception.
   * 
   * @param message
   *          the message
   * @param code
   *          the code
   * @param e
   *          the e
   */
  public RecurlyException(String message, Integer code, Exception e) {
    super(message, e);
    this.code = code;
  }

  /**
   * Instantiates a new recurly exception.
   * 
   * @param message
   *          the message
   */
  public RecurlyException(String message) {
    super(message);
  }

  /**
   * Instantiates a new recurly exception.
   * 
   * @param message
   *          the message
   * @param e
   *          the e
   */
  public RecurlyException(String message, Exception e) {
    super(message, e);
  }

  /**
   * Instantiates a new recurly exception.
   * 
   * @param message
   *          the message
   * @param code
   *          the code
   * @param recurlyErrors
   *          the recurly errors
   */
  public RecurlyException(String message, Integer code, RecurlyErrors recurlyErrors) {
    super(message);
    this.code = code;
    this.recurlyErrors = recurlyErrors;
  }

  /**
   * Gets the code.
   * 
   * @return the code
   */
  public Integer getCode() {
    return code;
  }

  /**
   * Sets the code.
   * 
   * @param code
   *          the new code
   */
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Gets the recurly errors.
   * 
   * @return the recurly errors
   */
  public RecurlyErrors getRecurlyErrors() {
    return recurlyErrors;
  }

  /**
   * Sets the recurly errors.
   * 
   * @param recurlyErrors
   *          the new recurly errors
   */
  public void setRecurlyErrors(RecurlyErrors recurlyErrors) {
    this.recurlyErrors = recurlyErrors;
  }

}
