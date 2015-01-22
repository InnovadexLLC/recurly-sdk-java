/**
 * 
 */
package com.sciul.recurly.proxies;

/**
 * The Interface Notifier.
 * 
 * @author GauravChawla
 */
public interface Notifier {

  /**
   * Publish error.
   * 
   * @param error
   *          the error
   * @param errorCode
   *          the error code
   */
  public void publish(String error, Integer errorCode);
}
