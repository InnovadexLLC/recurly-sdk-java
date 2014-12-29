package com.sciul.recurly.exception;

import com.sciul.recurly.model.RecurlyErrors;

public class RecurlyException extends Exception {

  private static final long serialVersionUID = -7345365257887387856L;
  private Integer code;
  private RecurlyErrors recurlyErrors;

  public RecurlyException(String message, Integer code) {
    super(message);
    this.code = code;
  }

  public RecurlyException(String message) {
    super(message);
  }

  public RecurlyException(String message, Integer code, RecurlyErrors recurlyErrors) {
    super(message);
    this.code = code;
    this.recurlyErrors = recurlyErrors;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public RecurlyErrors getRecurlyErrors() {
    return recurlyErrors;
  }

  public void setRecurlyErrors(RecurlyErrors recurlyErrors) {
    this.recurlyErrors = recurlyErrors;
  }

}
