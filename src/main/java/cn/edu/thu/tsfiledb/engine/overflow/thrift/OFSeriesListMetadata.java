/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cn.edu.thu.tsfiledb.engine.overflow.thrift;

import cn.edu.thu.tsfile.format.TimeSeriesChunkMetaData;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-16")
public class OFSeriesListMetadata implements org.apache.thrift.TBase<OFSeriesListMetadata, OFSeriesListMetadata._Fields>, java.io.Serializable, Cloneable, Comparable<OFSeriesListMetadata> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OFSeriesListMetadata");

  private static final org.apache.thrift.protocol.TField TSC_METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("tsc_metadata", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField MEASUREMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("measurement_id", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new OFSeriesListMetadataStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new OFSeriesListMetadataTupleSchemeFactory();

  public java.util.List<TimeSeriesChunkMetaData> tsc_metadata; // required
  public java.lang.String measurement_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TSC_METADATA((short)1, "tsc_metadata"),
    MEASUREMENT_ID((short)2, "measurement_id");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TSC_METADATA
          return TSC_METADATA;
        case 2: // MEASUREMENT_ID
          return MEASUREMENT_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TSC_METADATA, new org.apache.thrift.meta_data.FieldMetaData("tsc_metadata", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TimeSeriesChunkMetaData.class))));
    tmpMap.put(_Fields.MEASUREMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("measurement_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OFSeriesListMetadata.class, metaDataMap);
  }

  public OFSeriesListMetadata() {
  }

  public OFSeriesListMetadata(
    java.util.List<TimeSeriesChunkMetaData> tsc_metadata,
    java.lang.String measurement_id)
  {
    this();
    this.tsc_metadata = tsc_metadata;
    this.measurement_id = measurement_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OFSeriesListMetadata(OFSeriesListMetadata other) {
    if (other.isSetTsc_metadata()) {
      java.util.List<TimeSeriesChunkMetaData> __this__tsc_metadata = new java.util.ArrayList<TimeSeriesChunkMetaData>(other.tsc_metadata.size());
      for (TimeSeriesChunkMetaData other_element : other.tsc_metadata) {
        __this__tsc_metadata.add(new TimeSeriesChunkMetaData(other_element));
      }
      this.tsc_metadata = __this__tsc_metadata;
    }
    if (other.isSetMeasurement_id()) {
      this.measurement_id = other.measurement_id;
    }
  }

  public OFSeriesListMetadata deepCopy() {
    return new OFSeriesListMetadata(this);
  }

  @Override
  public void clear() {
    this.tsc_metadata = null;
    this.measurement_id = null;
  }

  public int getTsc_metadataSize() {
    return (this.tsc_metadata == null) ? 0 : this.tsc_metadata.size();
  }

  public java.util.Iterator<TimeSeriesChunkMetaData> getTsc_metadataIterator() {
    return (this.tsc_metadata == null) ? null : this.tsc_metadata.iterator();
  }

  public void addToTsc_metadata(TimeSeriesChunkMetaData elem) {
    if (this.tsc_metadata == null) {
      this.tsc_metadata = new java.util.ArrayList<TimeSeriesChunkMetaData>();
    }
    this.tsc_metadata.add(elem);
  }

  public java.util.List<TimeSeriesChunkMetaData> getTsc_metadata() {
    return this.tsc_metadata;
  }

  public OFSeriesListMetadata setTsc_metadata(java.util.List<TimeSeriesChunkMetaData> tsc_metadata) {
    this.tsc_metadata = tsc_metadata;
    return this;
  }

  public void unsetTsc_metadata() {
    this.tsc_metadata = null;
  }

  /** Returns true if field tsc_metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetTsc_metadata() {
    return this.tsc_metadata != null;
  }

  public void setTsc_metadataIsSet(boolean value) {
    if (!value) {
      this.tsc_metadata = null;
    }
  }

  public java.lang.String getMeasurement_id() {
    return this.measurement_id;
  }

  public OFSeriesListMetadata setMeasurement_id(java.lang.String measurement_id) {
    this.measurement_id = measurement_id;
    return this;
  }

  public void unsetMeasurement_id() {
    this.measurement_id = null;
  }

  /** Returns true if field measurement_id is set (has been assigned a value) and false otherwise */
  public boolean isSetMeasurement_id() {
    return this.measurement_id != null;
  }

  public void setMeasurement_idIsSet(boolean value) {
    if (!value) {
      this.measurement_id = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TSC_METADATA:
      if (value == null) {
        unsetTsc_metadata();
      } else {
        setTsc_metadata((java.util.List<TimeSeriesChunkMetaData>)value);
      }
      break;

    case MEASUREMENT_ID:
      if (value == null) {
        unsetMeasurement_id();
      } else {
        setMeasurement_id((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TSC_METADATA:
      return getTsc_metadata();

    case MEASUREMENT_ID:
      return getMeasurement_id();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TSC_METADATA:
      return isSetTsc_metadata();
    case MEASUREMENT_ID:
      return isSetMeasurement_id();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof OFSeriesListMetadata)
      return this.equals((OFSeriesListMetadata)that);
    return false;
  }

  public boolean equals(OFSeriesListMetadata that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tsc_metadata = true && this.isSetTsc_metadata();
    boolean that_present_tsc_metadata = true && that.isSetTsc_metadata();
    if (this_present_tsc_metadata || that_present_tsc_metadata) {
      if (!(this_present_tsc_metadata && that_present_tsc_metadata))
        return false;
      if (!this.tsc_metadata.equals(that.tsc_metadata))
        return false;
    }

    boolean this_present_measurement_id = true && this.isSetMeasurement_id();
    boolean that_present_measurement_id = true && that.isSetMeasurement_id();
    if (this_present_measurement_id || that_present_measurement_id) {
      if (!(this_present_measurement_id && that_present_measurement_id))
        return false;
      if (!this.measurement_id.equals(that.measurement_id))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTsc_metadata()) ? 131071 : 524287);
    if (isSetTsc_metadata())
      hashCode = hashCode * 8191 + tsc_metadata.hashCode();

    hashCode = hashCode * 8191 + ((isSetMeasurement_id()) ? 131071 : 524287);
    if (isSetMeasurement_id())
      hashCode = hashCode * 8191 + measurement_id.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(OFSeriesListMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTsc_metadata()).compareTo(other.isSetTsc_metadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTsc_metadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tsc_metadata, other.tsc_metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMeasurement_id()).compareTo(other.isSetMeasurement_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMeasurement_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.measurement_id, other.measurement_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("OFSeriesListMetadata(");
    boolean first = true;

    sb.append("tsc_metadata:");
    if (this.tsc_metadata == null) {
      sb.append("null");
    } else {
      sb.append(this.tsc_metadata);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("measurement_id:");
    if (this.measurement_id == null) {
      sb.append("null");
    } else {
      sb.append(this.measurement_id);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tsc_metadata == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tsc_metadata' was not present! Struct: " + toString());
    }
    if (measurement_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'measurement_id' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class OFSeriesListMetadataStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OFSeriesListMetadataStandardScheme getScheme() {
      return new OFSeriesListMetadataStandardScheme();
    }
  }

  private static class OFSeriesListMetadataStandardScheme extends org.apache.thrift.scheme.StandardScheme<OFSeriesListMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OFSeriesListMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TSC_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list88 = iprot.readListBegin();
                struct.tsc_metadata = new java.util.ArrayList<TimeSeriesChunkMetaData>(_list88.size);
                TimeSeriesChunkMetaData _elem89;
                for (int _i90 = 0; _i90 < _list88.size; ++_i90)
                {
                  _elem89 = new TimeSeriesChunkMetaData();
                  _elem89.read(iprot);
                  struct.tsc_metadata.add(_elem89);
                }
                iprot.readListEnd();
              }
              struct.setTsc_metadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MEASUREMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.measurement_id = iprot.readString();
              struct.setMeasurement_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, OFSeriesListMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tsc_metadata != null) {
        oprot.writeFieldBegin(TSC_METADATA_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tsc_metadata.size()));
          for (TimeSeriesChunkMetaData _iter91 : struct.tsc_metadata)
          {
            _iter91.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.measurement_id != null) {
        oprot.writeFieldBegin(MEASUREMENT_ID_FIELD_DESC);
        oprot.writeString(struct.measurement_id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OFSeriesListMetadataTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OFSeriesListMetadataTupleScheme getScheme() {
      return new OFSeriesListMetadataTupleScheme();
    }
  }

  private static class OFSeriesListMetadataTupleScheme extends org.apache.thrift.scheme.TupleScheme<OFSeriesListMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OFSeriesListMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tsc_metadata.size());
        for (TimeSeriesChunkMetaData _iter92 : struct.tsc_metadata)
        {
          _iter92.write(oprot);
        }
      }
      oprot.writeString(struct.measurement_id);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OFSeriesListMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list93 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tsc_metadata = new java.util.ArrayList<TimeSeriesChunkMetaData>(_list93.size);
        TimeSeriesChunkMetaData _elem94;
        for (int _i95 = 0; _i95 < _list93.size; ++_i95)
        {
          _elem94 = new TimeSeriesChunkMetaData();
          _elem94.read(iprot);
          struct.tsc_metadata.add(_elem94);
        }
      }
      struct.setTsc_metadataIsSet(true);
      struct.measurement_id = iprot.readString();
      struct.setMeasurement_idIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
