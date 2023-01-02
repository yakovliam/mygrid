package com.yakovliam.mygridbridge.fault.types;

import com.yakovliam.mygridbridge.fault.FaultReason;
import com.yakovliam.mygridbridge.fault.FaultRootCause;
import java.util.Optional;

/**
 * An electrical fault.
 * <p>
 * A fault that is caused by an electrical issue with the grid.
 *
 * @author Jacob C.
 */
public abstract class ElectricalFault {

  /**
   * The reason for the electrical fault.
   * This field may be null because sometimes it hasn't been calculated yet.
   * This is the case when the fault is first created.
   */
  private FaultReason reason;

  /**
   * The root cause of the electrical fault.
   * This field may be null because sometimes it hasn't been calculated yet.
   * This is the case when the fault is first created.
   */
  private FaultRootCause rootCause;

  /**
   * Creates a new electrical fault.
   */
  protected ElectricalFault() {
    this.reason = null;
    this.rootCause = null;
  }

  /**
   * Gets the reason for the fault.
   *
   * @return the reason for the fault
   */
  public Optional<FaultReason> getReason() {
    return Optional.ofNullable(reason);
  }

  /**
   * Gets the root cause of the fault.
   *
   * @return the root cause of the fault
   */
  public Optional<FaultRootCause> getRootCause() {
    return Optional.ofNullable(rootCause);
  }

  /**
   * Sets the reason for the fault.
   *
   * @param reason the reason for the fault.
   * @return the electrical fault
   */
  public ElectricalFault setReason(FaultReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Sets the root cause of the fault.
   *
   * @param rootCause the root cause of the fault
   * @return the electrical fault
   */
  public ElectricalFault setRootCause(FaultRootCause rootCause) {
    this.rootCause = rootCause;
    return this;
  }
}
