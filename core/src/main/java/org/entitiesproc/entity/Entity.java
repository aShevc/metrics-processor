/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.entitiesproc.entity;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Entity extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7148572786642277915L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Entity\",\"namespace\":\"org.entitiesproc.entity\",\"fields\":[{\"name\":\"device_id\",\"type\":\"string\"},{\"name\":\"temperature\",\"type\":\"int\"},{\"name\":\"timestamp\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Entity> ENCODER =
      new BinaryMessageEncoder<Entity>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Entity> DECODER =
      new BinaryMessageDecoder<Entity>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Entity> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Entity> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Entity> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Entity>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Entity to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Entity from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Entity instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Entity fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence device_id;
   private int temperature;
   private long timestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Entity() {}

  /**
   * All-args constructor.
   * @param device_id The new value for device_id
   * @param temperature The new value for temperature
   * @param timestamp The new value for timestamp
   */
  public Entity(java.lang.CharSequence device_id, java.lang.Integer temperature, java.lang.Long timestamp) {
    this.device_id = device_id;
    this.temperature = temperature;
    this.timestamp = timestamp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return device_id;
    case 1: return temperature;
    case 2: return timestamp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: device_id = (java.lang.CharSequence)value$; break;
    case 1: temperature = (java.lang.Integer)value$; break;
    case 2: timestamp = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'device_id' field.
   * @return The value of the 'device_id' field.
   */
  public java.lang.CharSequence getDeviceId() {
    return device_id;
  }


  /**
   * Sets the value of the 'device_id' field.
   * @param value the value to set.
   */
  public void setDeviceId(java.lang.CharSequence value) {
    this.device_id = value;
  }

  /**
   * Gets the value of the 'temperature' field.
   * @return The value of the 'temperature' field.
   */
  public int getTemperature() {
    return temperature;
  }


  /**
   * Sets the value of the 'temperature' field.
   * @param value the value to set.
   */
  public void setTemperature(int value) {
    this.temperature = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public long getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(long value) {
    this.timestamp = value;
  }

  /**
   * Creates a new Entity RecordBuilder.
   * @return A new Entity RecordBuilder
   */
  public static org.entitiesproc.entity.Entity.Builder newBuilder() {
    return new org.entitiesproc.entity.Entity.Builder();
  }

  /**
   * Creates a new Entity RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Entity RecordBuilder
   */
  public static org.entitiesproc.entity.Entity.Builder newBuilder(org.entitiesproc.entity.Entity.Builder other) {
    if (other == null) {
      return new org.entitiesproc.entity.Entity.Builder();
    } else {
      return new org.entitiesproc.entity.Entity.Builder(other);
    }
  }

  /**
   * Creates a new Entity RecordBuilder by copying an existing Entity instance.
   * @param other The existing instance to copy.
   * @return A new Entity RecordBuilder
   */
  public static org.entitiesproc.entity.Entity.Builder newBuilder(org.entitiesproc.entity.Entity other) {
    if (other == null) {
      return new org.entitiesproc.entity.Entity.Builder();
    } else {
      return new org.entitiesproc.entity.Entity.Builder(other);
    }
  }

  /**
   * RecordBuilder for Entity instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Entity>
    implements org.apache.avro.data.RecordBuilder<Entity> {

    private java.lang.CharSequence device_id;
    private int temperature;
    private long timestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.entitiesproc.entity.Entity.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.device_id)) {
        this.device_id = data().deepCopy(fields()[0].schema(), other.device_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.temperature)) {
        this.temperature = data().deepCopy(fields()[1].schema(), other.temperature);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Entity instance
     * @param other The existing instance to copy.
     */
    private Builder(org.entitiesproc.entity.Entity other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.device_id)) {
        this.device_id = data().deepCopy(fields()[0].schema(), other.device_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.temperature)) {
        this.temperature = data().deepCopy(fields()[1].schema(), other.temperature);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'device_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getDeviceId() {
      return device_id;
    }


    /**
      * Sets the value of the 'device_id' field.
      * @param value The value of 'device_id'.
      * @return This builder.
      */
    public org.entitiesproc.entity.Entity.Builder setDeviceId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.device_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'device_id' field has been set.
      * @return True if the 'device_id' field has been set, false otherwise.
      */
    public boolean hasDeviceId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'device_id' field.
      * @return This builder.
      */
    public org.entitiesproc.entity.Entity.Builder clearDeviceId() {
      device_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'temperature' field.
      * @return The value.
      */
    public int getTemperature() {
      return temperature;
    }


    /**
      * Sets the value of the 'temperature' field.
      * @param value The value of 'temperature'.
      * @return This builder.
      */
    public org.entitiesproc.entity.Entity.Builder setTemperature(int value) {
      validate(fields()[1], value);
      this.temperature = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'temperature' field has been set.
      * @return True if the 'temperature' field has been set, false otherwise.
      */
    public boolean hasTemperature() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'temperature' field.
      * @return This builder.
      */
    public org.entitiesproc.entity.Entity.Builder clearTemperature() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public long getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public org.entitiesproc.entity.Entity.Builder setTimestamp(long value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public org.entitiesproc.entity.Entity.Builder clearTimestamp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Entity build() {
      try {
        Entity record = new Entity();
        record.device_id = fieldSetFlags()[0] ? this.device_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.temperature = fieldSetFlags()[1] ? this.temperature : (java.lang.Integer) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Entity>
    WRITER$ = (org.apache.avro.io.DatumWriter<Entity>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Entity>
    READER$ = (org.apache.avro.io.DatumReader<Entity>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.device_id);

    out.writeInt(this.temperature);

    out.writeLong(this.timestamp);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.device_id = in.readString(this.device_id instanceof Utf8 ? (Utf8)this.device_id : null);

      this.temperature = in.readInt();

      this.timestamp = in.readLong();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.device_id = in.readString(this.device_id instanceof Utf8 ? (Utf8)this.device_id : null);
          break;

        case 1:
          this.temperature = in.readInt();
          break;

        case 2:
          this.timestamp = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










