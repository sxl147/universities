// ORM class for table 'student_courses'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jun 15 15:22:40 PDT 2017
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

public class student_courses extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer student_course_id;
  public Integer get_student_course_id() {
    return student_course_id;
  }
  public void set_student_course_id(Integer student_course_id) {
    this.student_course_id = student_course_id;
  }
  public student_courses with_student_course_id(Integer student_course_id) {
    this.student_course_id = student_course_id;
    return this;
  }
  private Integer student_id;
  public Integer get_student_id() {
    return student_id;
  }
  public void set_student_id(Integer student_id) {
    this.student_id = student_id;
  }
  public student_courses with_student_id(Integer student_id) {
    this.student_id = student_id;
    return this;
  }
  private Integer course_id;
  public Integer get_course_id() {
    return course_id;
  }
  public void set_course_id(Integer course_id) {
    this.course_id = course_id;
  }
  public student_courses with_course_id(Integer course_id) {
    this.course_id = course_id;
    return this;
  }
  private java.sql.Timestamp evnt_tmestmp;
  public java.sql.Timestamp get_evnt_tmestmp() {
    return evnt_tmestmp;
  }
  public void set_evnt_tmestmp(java.sql.Timestamp evnt_tmestmp) {
    this.evnt_tmestmp = evnt_tmestmp;
  }
  public student_courses with_evnt_tmestmp(java.sql.Timestamp evnt_tmestmp) {
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
  public student_courses with_evnt_oper_id(String evnt_oper_id) {
    this.evnt_oper_id = evnt_oper_id;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof student_courses)) {
      return false;
    }
    student_courses that = (student_courses) o;
    boolean equal = true;
    equal = equal && (this.student_course_id == null ? that.student_course_id == null : this.student_course_id.equals(that.student_course_id));
    equal = equal && (this.student_id == null ? that.student_id == null : this.student_id.equals(that.student_id));
    equal = equal && (this.course_id == null ? that.course_id == null : this.course_id.equals(that.course_id));
    equal = equal && (this.evnt_tmestmp == null ? that.evnt_tmestmp == null : this.evnt_tmestmp.equals(that.evnt_tmestmp));
    equal = equal && (this.evnt_oper_id == null ? that.evnt_oper_id == null : this.evnt_oper_id.equals(that.evnt_oper_id));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof student_courses)) {
      return false;
    }
    student_courses that = (student_courses) o;
    boolean equal = true;
    equal = equal && (this.student_course_id == null ? that.student_course_id == null : this.student_course_id.equals(that.student_course_id));
    equal = equal && (this.student_id == null ? that.student_id == null : this.student_id.equals(that.student_id));
    equal = equal && (this.course_id == null ? that.course_id == null : this.course_id.equals(that.course_id));
    equal = equal && (this.evnt_tmestmp == null ? that.evnt_tmestmp == null : this.evnt_tmestmp.equals(that.evnt_tmestmp));
    equal = equal && (this.evnt_oper_id == null ? that.evnt_oper_id == null : this.evnt_oper_id.equals(that.evnt_oper_id));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.student_course_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.student_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.course_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.evnt_tmestmp = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.evnt_oper_id = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.student_course_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.student_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.course_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.evnt_tmestmp = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.evnt_oper_id = JdbcWritableBridge.readString(5, __dbResults);
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
    JdbcWritableBridge.writeInteger(student_course_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(student_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(course_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(evnt_tmestmp, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(evnt_oper_id, 5 + __off, 12, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(student_course_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(student_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(course_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(evnt_tmestmp, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(evnt_oper_id, 5 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.student_course_id = null;
    } else {
    this.student_course_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.student_id = null;
    } else {
    this.student_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.course_id = null;
    } else {
    this.course_id = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.student_course_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.student_course_id);
    }
    if (null == this.student_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.student_id);
    }
    if (null == this.course_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.course_id);
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
    if (null == this.student_course_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.student_course_id);
    }
    if (null == this.student_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.student_id);
    }
    if (null == this.course_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.course_id);
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
    __sb.append(FieldFormatter.escapeAndEnclose(student_course_id==null?"null":"" + student_course_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(student_id==null?"null":"" + student_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(course_id==null?"null":"" + course_id, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(student_course_id==null?"null":"" + student_course_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(student_id==null?"null":"" + student_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(course_id==null?"null":"" + course_id, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.student_course_id = null; } else {
      this.student_course_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.student_id = null; } else {
      this.student_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.course_id = null; } else {
      this.course_id = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.student_course_id = null; } else {
      this.student_course_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.student_id = null; } else {
      this.student_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.course_id = null; } else {
      this.course_id = Integer.valueOf(__cur_str);
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
    student_courses o = (student_courses) super.clone();
    o.evnt_tmestmp = (o.evnt_tmestmp != null) ? (java.sql.Timestamp) o.evnt_tmestmp.clone() : null;
    return o;
  }

  public void clone0(student_courses o) throws CloneNotSupportedException {
    o.evnt_tmestmp = (o.evnt_tmestmp != null) ? (java.sql.Timestamp) o.evnt_tmestmp.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("student_course_id", this.student_course_id);
    __sqoop$field_map.put("student_id", this.student_id);
    __sqoop$field_map.put("course_id", this.course_id);
    __sqoop$field_map.put("evnt_tmestmp", this.evnt_tmestmp);
    __sqoop$field_map.put("evnt_oper_id", this.evnt_oper_id);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("student_course_id", this.student_course_id);
    __sqoop$field_map.put("student_id", this.student_id);
    __sqoop$field_map.put("course_id", this.course_id);
    __sqoop$field_map.put("evnt_tmestmp", this.evnt_tmestmp);
    __sqoop$field_map.put("evnt_oper_id", this.evnt_oper_id);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("student_course_id".equals(__fieldName)) {
      this.student_course_id = (Integer) __fieldVal;
    }
    else    if ("student_id".equals(__fieldName)) {
      this.student_id = (Integer) __fieldVal;
    }
    else    if ("course_id".equals(__fieldName)) {
      this.course_id = (Integer) __fieldVal;
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
    if ("student_course_id".equals(__fieldName)) {
      this.student_course_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("student_id".equals(__fieldName)) {
      this.student_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("course_id".equals(__fieldName)) {
      this.course_id = (Integer) __fieldVal;
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
