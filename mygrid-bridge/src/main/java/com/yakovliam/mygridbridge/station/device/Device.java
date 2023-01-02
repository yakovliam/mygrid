package com.yakovliam.mygridbridge.station.device;

import java.util.UUID;

/**
 * Represents a relay protection device
 *
 * @author Jacob C.
 */
public final class Device {

  /**
   * The device's programmatic name
   */
  private final String handle;

  /**
   * The device's friendly name
   */
  private final String name;

  /**
   * The device's unique identifier
   * <p>
   * This unique identifier is used to identify the device. It is defined by the
   * system and is guaranteed to be unique. It is not related to the device's
   * self-assigned unique identifiers of any kind.
   */
  private final UUID id;

  /**
   * The device's manufacturer
   */
  private final DeviceManufacturer manufacturer;

  /**
   * Device constructor.
   *
   * @param handle       the device's programmatic name
   * @param name         the device's friendly name
   * @param id           the device's unique identifier
   * @param manufacturer the device's manufacturer
   */
  public Device(String handle, String name, UUID id, DeviceManufacturer manufacturer) {
    this.handle = handle;
    this.name = name;
    this.id = id;
    this.manufacturer = manufacturer;
  }

  /**
   * Gets the device's programmatic name.
   *
   * @return the device's programmatic name
   */
  public String getHandle() {
    return handle;
  }

  /**
   * Gets the device's friendly name.
   *
   * @return the device's friendly name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the device's unique identifier.
   *
   * @return the device's unique identifier
   */
  public UUID getId() {
    return id;
  }

  /**
   * Gets the device's manufacturer.
   *
   * @return the device's manufacturer
   */
  public DeviceManufacturer getManufacturer() {
    return manufacturer;
  }
}
