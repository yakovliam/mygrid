package com.yakovliam.mygridbridge.fault;

import com.yakovliam.mygridbridge.fault.types.ElectricalFault;
import java.time.Instant;
import java.util.UUID;

/**
 * A fault event.
 * <p>
 * A fault event is an event that occurs when a fault is detected on a device that is connected to the grid.
 *
 * @author Jacob C.
 */
public final class FaultEvent {

  /**
   * The fault event's unique identifier.
   */
  private final UUID id;

  /**
   * The fault event's parent device identifier.
   */
  private final UUID deviceId;

  /**
   * The fault's timestamp.
   */
  private final Instant timestamp;

  /**
   * The number of nanoseconds added to the timestamp to represent the time of day to the
   * resolution of a nanosecond.
   */
  private final long nanoSecondsOffset;

  /**
   * The electrical fault.
   */
  private final ElectricalFault fault;

  /**
   * Fault event constructor.
   *
   * @param id                the fault event's unique identifier.
   * @param deviceId          the fault event's parent device identifier.
   * @param timestamp         the fault's timestamp.
   * @param nanoSecondsOffset the number of nanoseconds added to the timestamp to represent the.
   * @param fault             the electrical fault.
   */
  public FaultEvent(UUID id, UUID deviceId, Instant timestamp, long nanoSecondsOffset,
                    ElectricalFault fault) {
    this.id = id;
    this.deviceId = deviceId;
    this.timestamp = timestamp;
    this.nanoSecondsOffset = nanoSecondsOffset;
    this.fault = fault;
  }

  /**
   * Gets the fault event's unique identifier.
   *
   * @return the fault event's unique identifier.
   */
  public UUID getId() {
    return id;
  }

  /**
   * Gets the fault event's parent device identifier.
   *
   * @return the fault event's parent device identifier.
   */
  public UUID getDeviceId() {
    return deviceId;
  }

  /**
   * Gets the fault's timestamp.
   *
   * @return the fault's timestamp.
   */
  public Instant getTimestamp() {
    return timestamp;
  }

  /**
   * Gets the number of nanoseconds added to the timestamp to represent the time of day to the
   * resolution of a nanosecond.
   *
   * @return the number of nanoseconds added to the timestamp to represent the time of day to the resolution of a nanosecond.
   */
  public long getNanoSecondsOffset() {
    return nanoSecondsOffset;
  }

  /**
   * Gets the electrical fault.
   *
   * @return the electrical fault.
   */
  public ElectricalFault getFault() {
    return fault;
  }
}
