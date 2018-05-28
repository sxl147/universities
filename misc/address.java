// ORM class for table 'address'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jun 15 14:59:08 PDT 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class address extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer address_id;
  public Integer get_address_id() {
    return address_id;
  }
  public void set_address_id(Integer address_id) {
    this.address_id = address_id;
  }
  public address with_address_id(Integer address_id) {
    this.address_id = address_id;
    return this;
  }
  private Integer address_type_id;
  public Integer get_address_type_id() {
    return address_type_id;
  }
  public void set_address_type_id(Integer address_type_id) {
    this.address_type_id = address_type_id;
  }
  public address with_address_type_id(Integer address_type_id) {
    this.address_type_id = address_type_id;
    return this;
  }
  private Integer connector_id;
  public Integer get_connector_id() {
    return connector_id;
  }
  public void set_connector_id(Integer connector_id) {
    this.connector_id = connector_id;
  }
  public address with_connector_id(Integer connector_id) {
    this.connector_id = connector_id;
    return this;
  }
  private String full_street_name;
  public String get_full_street_name() {
    return full_street_name;
  }
  public void set_full_street_name(String full_street_name) {
    this.full_street_name = full_street_name;
  }
  public address with_full_street_name(String full_street_name) {
    this.full_street_name = full_street_name;
    return this;
  }
  private Integer city_id;
  public Integer get_city_id() {
    return city_id;
  }
  public void set_city_id(Integer city_id) {
    this.city_id = city_id;
  }
  public address with_city_id(Integer city_id) {
    this.city_id = city_id;
    return this;
  }
  private Integer state_id;
  public Integer get_state_id() {
    return state_id;
  }
  public void set_state_id(Integer state_id) {
    this.state_id = state_id;
  }
  public address with_state_id(Integer state_id) {
    this.state_id = state_id;
    return this;
  }
  private String zip_code;
  public String get_zip_code() {
    return zip_code;
  }
  public void set_zip_code(String zip_code) {
    this.zip_code = zip_code;
  }
  public address with_zip_code(String zip_code) {
    this.zip_code = zip_code;
    return this;
  }
  private java.sql.Timestamp evnt_tmestmp;
  public java.sql.Timestamp get_evnt_tmestmp() {
    return evnt_tmestmp;
  }
  public void set_evnt_tmestmp(java.sql.Timestamp evnt_tmestmp) {
    this.evnt_tmestmp = evnt_tmestmp;
  }
  public address with_evnt_tmestmp(java.sql.Timestamp evnt_tmestmp) {
    this.evnt_tmestmp = evnt_tmestmp;
    return this;
  }
  private String evnt_oper_id;
  public String get_evnt_oper_id() {
    return evnt_oper_id;
  }
  public void set_evnt_oper_id(String evnt_oper_id) {
    this.evnt_oper_id = evnt_oper_id;
  }
  public address with_evnt_oper_id(String evnt_oper_id) {
    this.evnt_oper_id = evnt_oper_id;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof address)) {
      return false;
    }
    address that = (address) o;
    boolean equal = true;
    equal = equal && (this.address_id == null ? that.address_id == null : this.address_id.equals(that.address_id));
    equal = equal && (this.address_type_id == null ? that.address_type_id == null : this.address_type_id.equals(that.address_type_id));
    equal = equal && (this.connector_id == null ? that.connector_id == null : this.connector_id.equals(that.connector_id));
    equal = equal && (this.full_street_name == null ? that.full_street_name == null : this.full_street_name.equals(that.full_street_name));
    equal = equal && (this.city_id == null ? that.city_id == null : this.city_id.equals(that.city_id));
    equal = equal && (this.state_id == null ? that.state_id == null : this.state_id.equals(that.state_id));
    equal = equal && (this.zip_code == null ? that.zip_code == null : this.zip_code.equals(that.zip_code));
    equal = equal && (this.evnt_tmestmp == null ? that.evnt_tmestmp == null : this.evnt_tmestmp.equals(that.evnt_tmestmp));
    equal = equal && (this.evnt_oper_id == null ? that.evnt_oper_id == null : this.evnt_oper_id.equals(that.evnt_oper_id));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof address)) {
      return false;
    }
    address that = (address) o;
    boolean equal = true;
    equal = equal && (this.address_id == null ? that.address_id == null : this.address_id.equals(that.address_id));
    equal = equal && (this.address_type_id == null ? that.address_type_id == null : this.address_type_id.equals(that.address_type_id));
    equal = equal && (this.connector_id == null ? that.connector_id == null : this.connector_id.equals(that.connector_id));
    equal = equal && (this.full_street_name == null ? that.full_street_name == null : this.full_street_name.equals(that.full_street_name));
    equal = equal && (this.city_id == null ? that.city_id == null : this.city_id.equals(that.city_id));
    equal = equal && (this.state_id == null ? that.state_id == null : this.state_id.equals(that.state_id));
    equal = equal && (this.zip_code == null ? that.zip_code == null : this.zip_code.equals(that.zip_code));
    equal = equal && (this.evnt_tmestmp == null ? that.evnt_tmestmp == null : this.evnt_tmestmp.equals(that.evnt_tmestmp));
    equal = equal && (this.evnt_oper_id == null ? that.evnt_oper_id == null : this.evnt_oper_id.equals(that.evnt_oper_id));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.address_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.address_type_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.connector_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.full_street_name = JdbcWritableBridge.readString(4, __dbResults);
    this.city_id = JdbcWritableBridge.readInteger(5, __dbResults);
    this.state_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.zip_code = JdbcWritableBridge.readString(7, __dbResults);
    this.evnt_tmestmp = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.evnt_oper_id = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.address_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.address_type_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.connector_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.full_street_name = JdbcWritableBridge.readString(4, __dbResults);
    this.city_id = JdbcWritableBridge.readInteger(5, __dbResults);
    this.state_id = JdbcWritableBridge.readInteger(6, __dbResults);
    this.zip_code = JdbcWritableBridge.readString(7, __dbResults);
    this.evnt_tmestmp = JdbcWritableBridge.readTimestamp(8, __dbResults);
    this.evnt_oper_id = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(address_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(address_type_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(connector_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(full_street_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(city_id, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(state_id, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(zip_code, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(evnt_tmestmp, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(evnt_oper_id, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(address_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(address_type_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(connector_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(full_street_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(city_id, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(state_id, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(zip_code, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(evnt_tmestmp, 8 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(evnt_oper_id, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.address_id = null;
    } else {
    this.address_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.address_type_id = null;
    } else {
    this.address_type_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.connector_id = null;
    } else {
    this.connector_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.full_street_name = null;
    } else {
    this.full_street_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city_id = null;
    } else {
    this.city_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.state_id = null;
    } else {
    this.state_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.zip_code = null;
    } else {
    this.zip_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.evnt_tmestmp = null;
    } else {
    this.evnt_tmestmp = new Timestamp(__dataIn.readLong());
    this.evnt_tmestmp.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.evnt_oper_id = null;
    } else {
    this.evnt_oper_id = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.address_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.address_id);
    }
    if (null == this.address_type_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.address_type_id);
    }
    if (null == this.connector_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.connector_id);
    }
    if (null == this.full_street_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, full_street_name);
    }
    if (null == this.city_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.city_id);
    }
    if (null == this.state_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.state_id);
    }
    if (null == this.zip_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zip_code);
    }
    if (null == this.evnt_tmestmp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.evnt_tmestmp.getTime());
    __dataOut.writeInt(this.evnt_tmestmp.getNanos());
    }
    if (null == this.evnt_oper_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, evnt_oper_id);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.address_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.address_id);
    }
    if (null == this.address_type_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.address_type_id);
    }
    if (null == this.connector_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.connector_id);
    }
    if (null == this.full_street_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, full_street_name);
    }
    if (null == this.city_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.city_id);
    }
    if (null == this.state_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.state_id);
    }
    if (null == this.zip_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zip_code);
    }
    if (null == this.evnt_tmestmp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.evnt_tmestmp.getTime());
    __dataOut.writeInt(this.evnt_tmestmp.getNanos());
    }
    if (null == this.evnt_oper_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, evnt_oper_id);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(address_id==null?"null":"" + address_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_type_id==null?"null":"" + address_type_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(connector_id==null?"null":"" + connector_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(full_street_name==null?"null":full_street_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_id==null?"null":"" + city_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state_id==null?"null":"" + state_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zip_code==null?"null":zip_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(evnt_tmestmp==null?"null":"" + evnt_tmestmp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(evnt_oper_id==null?"null":evnt_oper_id, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(address_id==null?"null":"" + address_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(address_type_id==null?"null":"" + address_type_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(connector_id==null?"null":"" + connector_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(full_street_name==null?"null":full_street_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city_id==null?"null":"" + city_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state_id==null?"null":"" + state_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zip_code==null?"null":zip_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(evnt_tmestmp==null?"null":"" + evnt_tmestmp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(evnt_oper_id==null?"null":evnt_oper_id, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_id = null; } else {
      this.address_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_type_id = null; } else {
      this.address_type_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.connector_id = null; } else {
      this.connector_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.full_street_name = null; } else {
      this.full_street_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.city_id = null; } else {
      this.city_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.state_id = null; } else {
      this.state_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.zip_code = null; } else {
      this.zip_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.evnt_tmestmp = null; } else {
      this.evnt_tmestmp = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.evnt_oper_id = null; } else {
      this.evnt_oper_id = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_id = null; } else {
      this.address_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.address_type_id = null; } else {
      this.address_type_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.connector_id = null; } else {
      this.connector_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.full_street_name = null; } else {
      this.full_street_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.city_id = null; } else {
      this.city_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.state_id = null; } else {
      this.state_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.zip_code = null; } else {
      this.zip_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.evnt_tmestmp = null; } else {
      this.evnt_tmestmp = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.evnt_oper_id = null; } else {
      this.evnt_oper_id = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    address o = (address) super.clone();
    o.evnt_tmestmp = (o.evnt_tmestmp != null) ? (java.sql.Timestamp) o.evnt_tmestmp.clone() : null;
    return o;
  }

  public void clone0(address o) throws CloneNotSupportedException {
    o.evnt_tmestmp = (o.evnt_tmestmp != null) ? (java.sql.Timestamp) o.evnt_tmestmp.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("address_id", this.address_id);
    __sqoop$field_map.put("address_type_id", this.address_type_id);
    __sqoop$field_map.put("connector_id", this.connector_id);
    __sqoop$field_map.put("full_street_name", this.full_street_name);
    __sqoop$field_map.put("city_id", this.city_id);
    __sqoop$field_map.put("state_id", this.state_id);
    __sqoop$field_map.put("zip_code", this.zip_code);
    __sqoop$field_map.put("evnt_tmestmp", this.evnt_tmestmp);
    __sqoop$field_map.put("evnt_oper_id", this.evnt_oper_id);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("address_id", this.address_id);
    __sqoop$field_map.put("address_type_id", this.address_type_id);
    __sqoop$field_map.put("connector_id", this.connector_id);
    __sqoop$field_map.put("full_street_name", this.full_street_name);
    __sqoop$field_map.put("city_id", this.city_id);
    __sqoop$field_map.put("state_id", this.state_id);
    __sqoop$field_map.put("zip_code", this.zip_code);
    __sqoop$field_map.put("evnt_tmestmp", this.evnt_tmestmp);
    __sqoop$field_map.put("evnt_oper_id", this.evnt_oper_id);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("address_id".equals(__fieldName)) {
      this.address_id = (Integer) __fieldVal;
    }
    else    if ("address_type_id".equals(__fieldName)) {
      this.address_type_id = (Integer) __fieldVal;
    }
    else    if ("connector_id".equals(__fieldName)) {
      this.connector_id = (Integer) __fieldVal;
    }
    else    if ("full_street_name".equals(__fieldName)) {
      this.full_street_name = (String) __fieldVal;
    }
    else    if ("city_id".equals(__fieldName)) {
      this.city_id = (Integer) __fieldVal;
    }
    else    if ("state_id".equals(__fieldName)) {
      this.state_id = (Integer) __fieldVal;
    }
    else    if ("zip_code".equals(__fieldName)) {
      this.zip_code = (String) __fieldVal;
    }
    else    if ("evnt_tmestmp".equals(__fieldName)) {
      this.evnt_tmestmp = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("evnt_oper_id".equals(__fieldName)) {
      this.evnt_oper_id = (String) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("address_id".equals(__fieldName)) {
      this.address_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("address_type_id".equals(__fieldName)) {
      this.address_type_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("connector_id".equals(__fieldName)) {
      this.connector_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("full_street_name".equals(__fieldName)) {
      this.full_street_name = (String) __fieldVal;
      return true;
    }
    else    if ("city_id".equals(__fieldName)) {
      this.city_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("state_id".equals(__fieldName)) {
      this.state_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("zip_code".equals(__fieldName)) {
      this.zip_code = (String) __fieldVal;
      return true;
    }
    else    if ("evnt_tmestmp".equals(__fieldName)) {
      this.evnt_tmestmp = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("evnt_oper_id".equals(__fieldName)) {
      this.evnt_oper_id = (String) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
