// ORM class for table 'majors'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jun 15 15:13:38 PDT 2017
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

public class majors extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer major_id;
  public Integer get_major_id() {
    return major_id;
  }
  public void set_major_id(Integer major_id) {
    this.major_id = major_id;
  }
  public majors with_major_id(Integer major_id) {
    this.major_id = major_id;
    return this;
  }
  private Integer department_id;
  public Integer get_department_id() {
    return department_id;
  }
  public void set_department_id(Integer department_id) {
    this.department_id = department_id;
  }
  public majors with_department_id(Integer department_id) {
    this.department_id = department_id;
    return this;
  }
  private String major_code;
  public String get_major_code() {
    return major_code;
  }
  public void set_major_code(String major_code) {
    this.major_code = major_code;
  }
  public majors with_major_code(String major_code) {
    this.major_code = major_code;
    return this;
  }
  private String major_description;
  public String get_major_description() {
    return major_description;
  }
  public void set_major_description(String major_description) {
    this.major_description = major_description;
  }
  public majors with_major_description(String major_description) {
    this.major_description = major_description;
    return this;
  }
  private String minor_flag;
  public String get_minor_flag() {
    return minor_flag;
  }
  public void set_minor_flag(String minor_flag) {
    this.minor_flag = minor_flag;
  }
  public majors with_minor_flag(String minor_flag) {
    this.minor_flag = minor_flag;
    return this;
  }
  private java.sql.Timestamp evnt_tmestmp;
  public java.sql.Timestamp get_evnt_tmestmp() {
    return evnt_tmestmp;
  }
  public void set_evnt_tmestmp(java.sql.Timestamp evnt_tmestmp) {
    this.evnt_tmestmp = evnt_tmestmp;
  }
  public majors with_evnt_tmestmp(java.sql.Timestamp evnt_tmestmp) {
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
  public majors with_evnt_oper_id(String evnt_oper_id) {
    this.evnt_oper_id = evnt_oper_id;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof majors)) {
      return false;
    }
    majors that = (majors) o;
    boolean equal = true;
    equal = equal && (this.major_id == null ? that.major_id == null : this.major_id.equals(that.major_id));
    equal = equal && (this.department_id == null ? that.department_id == null : this.department_id.equals(that.department_id));
    equal = equal && (this.major_code == null ? that.major_code == null : this.major_code.equals(that.major_code));
    equal = equal && (this.major_description == null ? that.major_description == null : this.major_description.equals(that.major_description));
    equal = equal && (this.minor_flag == null ? that.minor_flag == null : this.minor_flag.equals(that.minor_flag));
    equal = equal && (this.evnt_tmestmp == null ? that.evnt_tmestmp == null : this.evnt_tmestmp.equals(that.evnt_tmestmp));
    equal = equal && (this.evnt_oper_id == null ? that.evnt_oper_id == null : this.evnt_oper_id.equals(that.evnt_oper_id));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof majors)) {
      return false;
    }
    majors that = (majors) o;
    boolean equal = true;
    equal = equal && (this.major_id == null ? that.major_id == null : this.major_id.equals(that.major_id));
    equal = equal && (this.department_id == null ? that.department_id == null : this.department_id.equals(that.department_id));
    equal = equal && (this.major_code == null ? that.major_code == null : this.major_code.equals(that.major_code));
    equal = equal && (this.major_description == null ? that.major_description == null : this.major_description.equals(that.major_description));
    equal = equal && (this.minor_flag == null ? that.minor_flag == null : this.minor_flag.equals(that.minor_flag));
    equal = equal && (this.evnt_tmestmp == null ? that.evnt_tmestmp == null : this.evnt_tmestmp.equals(that.evnt_tmestmp));
    equal = equal && (this.evnt_oper_id == null ? that.evnt_oper_id == null : this.evnt_oper_id.equals(that.evnt_oper_id));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.major_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.department_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.major_code = JdbcWritableBridge.readString(3, __dbResults);
    this.major_description = JdbcWritableBridge.readString(4, __dbResults);
    this.minor_flag = JdbcWritableBridge.readString(5, __dbResults);
    this.evnt_tmestmp = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.evnt_oper_id = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.major_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.department_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.major_code = JdbcWritableBridge.readString(3, __dbResults);
    this.major_description = JdbcWritableBridge.readString(4, __dbResults);
    this.minor_flag = JdbcWritableBridge.readString(5, __dbResults);
    this.evnt_tmestmp = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.evnt_oper_id = JdbcWritableBridge.readString(7, __dbResults);
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
    JdbcWritableBridge.writeInteger(major_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(department_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(major_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(major_description, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(minor_flag, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(evnt_tmestmp, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(evnt_oper_id, 7 + __off, 12, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(major_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(department_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(major_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(major_description, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(minor_flag, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(evnt_tmestmp, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(evnt_oper_id, 7 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.major_id = null;
    } else {
    this.major_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.department_id = null;
    } else {
    this.department_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.major_code = null;
    } else {
    this.major_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.major_description = null;
    } else {
    this.major_description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.minor_flag = null;
    } else {
    this.minor_flag = Text.readString(__dataIn);
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
    if (null == this.major_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.major_id);
    }
    if (null == this.department_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.department_id);
    }
    if (null == this.major_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, major_code);
    }
    if (null == this.major_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, major_description);
    }
    if (null == this.minor_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, minor_flag);
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
    if (null == this.major_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.major_id);
    }
    if (null == this.department_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.department_id);
    }
    if (null == this.major_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, major_code);
    }
    if (null == this.major_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, major_description);
    }
    if (null == this.minor_flag) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, minor_flag);
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
    __sb.append(FieldFormatter.escapeAndEnclose(major_id==null?"null":"" + major_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(department_id==null?"null":"" + department_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(major_code==null?"null":major_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(major_description==null?"null":major_description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(minor_flag==null?"null":minor_flag, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(major_id==null?"null":"" + major_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(department_id==null?"null":"" + department_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(major_code==null?"null":major_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(major_description==null?"null":major_description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(minor_flag==null?"null":minor_flag, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.major_id = null; } else {
      this.major_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.department_id = null; } else {
      this.department_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.major_code = null; } else {
      this.major_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.major_description = null; } else {
      this.major_description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.minor_flag = null; } else {
      this.minor_flag = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.major_id = null; } else {
      this.major_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.department_id = null; } else {
      this.department_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.major_code = null; } else {
      this.major_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.major_description = null; } else {
      this.major_description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.minor_flag = null; } else {
      this.minor_flag = __cur_str;
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
    majors o = (majors) super.clone();
    o.evnt_tmestmp = (o.evnt_tmestmp != null) ? (java.sql.Timestamp) o.evnt_tmestmp.clone() : null;
    return o;
  }

  public void clone0(majors o) throws CloneNotSupportedException {
    o.evnt_tmestmp = (o.evnt_tmestmp != null) ? (java.sql.Timestamp) o.evnt_tmestmp.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("major_id", this.major_id);
    __sqoop$field_map.put("department_id", this.department_id);
    __sqoop$field_map.put("major_code", this.major_code);
    __sqoop$field_map.put("major_description", this.major_description);
    __sqoop$field_map.put("minor_flag", this.minor_flag);
    __sqoop$field_map.put("evnt_tmestmp", this.evnt_tmestmp);
    __sqoop$field_map.put("evnt_oper_id", this.evnt_oper_id);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("major_id", this.major_id);
    __sqoop$field_map.put("department_id", this.department_id);
    __sqoop$field_map.put("major_code", this.major_code);
    __sqoop$field_map.put("major_description", this.major_description);
    __sqoop$field_map.put("minor_flag", this.minor_flag);
    __sqoop$field_map.put("evnt_tmestmp", this.evnt_tmestmp);
    __sqoop$field_map.put("evnt_oper_id", this.evnt_oper_id);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("major_id".equals(__fieldName)) {
      this.major_id = (Integer) __fieldVal;
    }
    else    if ("department_id".equals(__fieldName)) {
      this.department_id = (Integer) __fieldVal;
    }
    else    if ("major_code".equals(__fieldName)) {
      this.major_code = (String) __fieldVal;
    }
    else    if ("major_description".equals(__fieldName)) {
      this.major_description = (String) __fieldVal;
    }
    else    if ("minor_flag".equals(__fieldName)) {
      this.minor_flag = (String) __fieldVal;
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
    if ("major_id".equals(__fieldName)) {
      this.major_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("department_id".equals(__fieldName)) {
      this.department_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("major_code".equals(__fieldName)) {
      this.major_code = (String) __fieldVal;
      return true;
    }
    else    if ("major_description".equals(__fieldName)) {
      this.major_description = (String) __fieldVal;
      return true;
    }
    else    if ("minor_flag".equals(__fieldName)) {
      this.minor_flag = (String) __fieldVal;
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
