// ORM class for table 'department'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jun 15 15:09:13 PDT 2017
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

public class department extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer department_id;
  public Integer get_department_id() {
    return department_id;
  }
  public void set_department_id(Integer department_id) {
    this.department_id = department_id;
  }
  public department with_department_id(Integer department_id) {
    this.department_id = department_id;
    return this;
  }
  private Integer university_id;
  public Integer get_university_id() {
    return university_id;
  }
  public void set_university_id(Integer university_id) {
    this.university_id = university_id;
  }
  public department with_university_id(Integer university_id) {
    this.university_id = university_id;
    return this;
  }
  private String department_code;
  public String get_department_code() {
    return department_code;
  }
  public void set_department_code(String department_code) {
    this.department_code = department_code;
  }
  public department with_department_code(String department_code) {
    this.department_code = department_code;
    return this;
  }
  private String department_name;
  public String get_department_name() {
    return department_name;
  }
  public void set_department_name(String department_name) {
    this.department_name = department_name;
  }
  public department with_department_name(String department_name) {
    this.department_name = department_name;
    return this;
  }
  private java.sql.Timestamp evnt_tmestmp;
  public java.sql.Timestamp get_evnt_tmestmp() {
    return evnt_tmestmp;
  }
  public void set_evnt_tmestmp(java.sql.Timestamp evnt_tmestmp) {
    this.evnt_tmestmp = evnt_tmestmp;
  }
  public department with_evnt_tmestmp(java.sql.Timestamp evnt_tmestmp) {
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
  public department with_evnt_oper_id(String evnt_oper_id) {
    this.evnt_oper_id = evnt_oper_id;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof department)) {
      return false;
    }
    department that = (department) o;
    boolean equal = true;
    equal = equal && (this.department_id == null ? that.department_id == null : this.department_id.equals(that.department_id));
    equal = equal && (this.university_id == null ? that.university_id == null : this.university_id.equals(that.university_id));
    equal = equal && (this.department_code == null ? that.department_code == null : this.department_code.equals(that.department_code));
    equal = equal && (this.department_name == null ? that.department_name == null : this.department_name.equals(that.department_name));
    equal = equal && (this.evnt_tmestmp == null ? that.evnt_tmestmp == null : this.evnt_tmestmp.equals(that.evnt_tmestmp));
    equal = equal && (this.evnt_oper_id == null ? that.evnt_oper_id == null : this.evnt_oper_id.equals(that.evnt_oper_id));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof department)) {
      return false;
    }
    department that = (department) o;
    boolean equal = true;
    equal = equal && (this.department_id == null ? that.department_id == null : this.department_id.equals(that.department_id));
    equal = equal && (this.university_id == null ? that.university_id == null : this.university_id.equals(that.university_id));
    equal = equal && (this.department_code == null ? that.department_code == null : this.department_code.equals(that.department_code));
    equal = equal && (this.department_name == null ? that.department_name == null : this.department_name.equals(that.department_name));
    equal = equal && (this.evnt_tmestmp == null ? that.evnt_tmestmp == null : this.evnt_tmestmp.equals(that.evnt_tmestmp));
    equal = equal && (this.evnt_oper_id == null ? that.evnt_oper_id == null : this.evnt_oper_id.equals(that.evnt_oper_id));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.department_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.university_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.department_code = JdbcWritableBridge.readString(3, __dbResults);
    this.department_name = JdbcWritableBridge.readString(4, __dbResults);
    this.evnt_tmestmp = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.evnt_oper_id = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.department_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.university_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.department_code = JdbcWritableBridge.readString(3, __dbResults);
    this.department_name = JdbcWritableBridge.readString(4, __dbResults);
    this.evnt_tmestmp = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.evnt_oper_id = JdbcWritableBridge.readString(6, __dbResults);
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
    JdbcWritableBridge.writeInteger(department_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(university_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(department_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(department_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(evnt_tmestmp, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(evnt_oper_id, 6 + __off, 12, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(department_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(university_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(department_code, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(department_name, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(evnt_tmestmp, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(evnt_oper_id, 6 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.department_id = null;
    } else {
    this.department_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.university_id = null;
    } else {
    this.university_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.department_code = null;
    } else {
    this.department_code = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.department_name = null;
    } else {
    this.department_name = Text.readString(__dataIn);
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
    if (null == this.department_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.department_id);
    }
    if (null == this.university_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.university_id);
    }
    if (null == this.department_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, department_code);
    }
    if (null == this.department_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, department_name);
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
    if (null == this.department_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.department_id);
    }
    if (null == this.university_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.university_id);
    }
    if (null == this.department_code) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, department_code);
    }
    if (null == this.department_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, department_name);
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
    __sb.append(FieldFormatter.escapeAndEnclose(department_id==null?"null":"" + department_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(university_id==null?"null":"" + university_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(department_code==null?"null":department_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(department_name==null?"null":department_name, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(department_id==null?"null":"" + department_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(university_id==null?"null":"" + university_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(department_code==null?"null":department_code, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(department_name==null?"null":department_name, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.department_id = null; } else {
      this.department_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.university_id = null; } else {
      this.university_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.department_code = null; } else {
      this.department_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.department_name = null; } else {
      this.department_name = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.department_id = null; } else {
      this.department_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.university_id = null; } else {
      this.university_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.department_code = null; } else {
      this.department_code = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.department_name = null; } else {
      this.department_name = __cur_str;
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
    department o = (department) super.clone();
    o.evnt_tmestmp = (o.evnt_tmestmp != null) ? (java.sql.Timestamp) o.evnt_tmestmp.clone() : null;
    return o;
  }

  public void clone0(department o) throws CloneNotSupportedException {
    o.evnt_tmestmp = (o.evnt_tmestmp != null) ? (java.sql.Timestamp) o.evnt_tmestmp.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("department_id", this.department_id);
    __sqoop$field_map.put("university_id", this.university_id);
    __sqoop$field_map.put("department_code", this.department_code);
    __sqoop$field_map.put("department_name", this.department_name);
    __sqoop$field_map.put("evnt_tmestmp", this.evnt_tmestmp);
    __sqoop$field_map.put("evnt_oper_id", this.evnt_oper_id);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("department_id", this.department_id);
    __sqoop$field_map.put("university_id", this.university_id);
    __sqoop$field_map.put("department_code", this.department_code);
    __sqoop$field_map.put("department_name", this.department_name);
    __sqoop$field_map.put("evnt_tmestmp", this.evnt_tmestmp);
    __sqoop$field_map.put("evnt_oper_id", this.evnt_oper_id);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("department_id".equals(__fieldName)) {
      this.department_id = (Integer) __fieldVal;
    }
    else    if ("university_id".equals(__fieldName)) {
      this.university_id = (Integer) __fieldVal;
    }
    else    if ("department_code".equals(__fieldName)) {
      this.department_code = (String) __fieldVal;
    }
    else    if ("department_name".equals(__fieldName)) {
      this.department_name = (String) __fieldVal;
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
    if ("department_id".equals(__fieldName)) {
      this.department_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("university_id".equals(__fieldName)) {
      this.university_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("department_code".equals(__fieldName)) {
      this.department_code = (String) __fieldVal;
      return true;
    }
    else    if ("department_name".equals(__fieldName)) {
      this.department_name = (String) __fieldVal;
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
