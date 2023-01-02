package com.yakovliam.mygridbridge.station;

import com.yakovliam.mygridbridge.station.device.Device;
import java.util.List;
import java.util.UUID;

/**
 * Represents a station that is connected to the grid.
 * <p>
 * A station is a theoretical concept that represents a collection of devices that are connected to the grid.
 * Sometimes stations are actually physical locations, but they can also be virtual. When physical,
 * they are called substations. When virtual, they are called virtual substations.
 *
 * @author Jacob C.
 */
public class Station {

  /**
   * The station's programmatic name
   */
  private final String handle;

  /**
   * The station's friendly name
   */
  private final String name;

  /**
   * The station's unique identifier
   * <p>
   * This unique identifier is used to identify the station. It is defined by the
   * system and is guaranteed to be unique. It is not related to the station's
   * self-assigned unique identifiers of any kind.
   */
  private final UUID id;

  /**
   * The station's device repository
   */
  private final List<Device> devices;

  /**
   * The station's unique identifier
   *
   * @param handle  The station's programmatic name
   * @param name    The station's friendly name
   * @param id      The station's unique identifier
   * @param devices The station's device repository
   */
  public Station(String handle, String name, UUID id, List<Device> devices) {
    this.handle = handle;
    this.name = name;
    this.id = id;
    this.devices = devices;
  }

  /**
   * The station's programmatic name
   *
   * @return The station's programmatic name
   */
  public String getHandle() {
    return handle;
  }

  /**
   * The station's friendly name
   *
   * @return The station's friendly name
   */
  public String getName() {
    return name;
  }

  /**
   * The station's unique identifier
   *
   * @return The station's unique identifier
   */
  public UUID getId() {
    return id;
  }

  /**
   * The station's device repository
   *
   * @return The station's device repository
   */
  public List<Device> getDevices() {
    return devices;
  }
}
