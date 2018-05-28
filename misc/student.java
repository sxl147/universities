// ORM class for table 'student'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Jun 15 15:11:25 PDT 2017
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

public class student extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer student_id;
  public Integer get_student_id() {
    return student_id;
  }
  public void set_student_id(Integer student_id) {
    this.student_id = student_id;
  }
  public student with_student_id(Integer student_id) {
    this.student_id = student_id;
    return this;
  }
  private Integer university_id;
  public Integer get_university_id() {
    return university_id;
  }
  public void set_university_id(Integer university_id) {
    this.university_id = university_id;
  }
  public student with_university_id(Integer university_id) {
    this.university_id = university_id;
    return this;
  }
  private String firstname;
  public String get_firstname() {
    return firstname;
  }
  public void set_firstname(String firstname) {
    this.firstname = firstname;
  }
  public student with_firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }
  private String lastname;
  public String get_lastname() {
    return lastname;
  }
  public void set_lastname(String lastname) {
    this.lastname = lastname;
  }
  public student with_lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }
  private String social_security_number;
  public String get_social_security_number() {
    return social_security_number;
  }
  public void set_social_security_number(String social_security_number) {
    this.social_security_number = social_security_number;
  }
  public student with_social_security_number(String social_security_number) {
    this.social_security_number = social_security_number;
    return this;
  }
  private java.sql.Timestamp evnt_tmestmp;
  public java.sql.Timestamp get_evnt_tmestmp() {
    return evnt_tmestmp;
  }
  public void set_evnt_tmestmp(java.sql.Timestamp evnt_tmestmp) {
    this.evnt_tmestmp = evnt_tmestmp;
  }
  public student with_evnt_tmestmp(java.sql.Timestamp evnt_tmestmp) {
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
  public student with_evnt_oper_id(String evnt_oper_id) {
    this.evnt_oper_id = evnt_oper_id;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof student)) {
      return false;
    }
    student that = (student) o;
    boolean equal = true;
    equal = equal && (this.student_id == null ? that.student_id == null : this.student_id.equals(that.student_id));
    equal = equal && (this.university_id == null ? that.university_id == null : this.university_id.equals(that.university_id));
    equal = equal && (this.firstname == null ? that.firstname == null : this.firstname.equals(that.firstname));
    equal = equal && (this.lastname == null ? that.lastname == null : this.lastname.equals(that.lastname));
    equal = equal && (this.social_security_number == null ? that.social_security_number == null : this.social_security_number.equals(that.social_security_number));
    equal = equal && (this.evnt_tmestmp == null ? that.evnt_tmestmp == null : this.evnt_tmestmp.equals(that.evnt_tmestmp));
    equal = equal && (this.evnt_oper_id == null ? that.evnt_oper_id == null : this.evnt_oper_id.equals(that.evnt_oper_id));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof student)) {
      return false;
    }
    student that = (student) o;
    boolean equal = true;
    equal = equal && (this.student_id == null ? that.student_id == null : this.student_id.equals(that.student_id));
    equal = equal && (this.university_id == null ? that.university_id == null : this.university_id.equals(that.university_id));
    equal = equal && (this.firstname == null ? that.firstname == null : this.firstname.equals(that.firstname));
    equal = equal && (this.lastname == null ? that.lastname == null : this.lastname.equals(that.lastname));
    equal = equal && (this.social_security_number == null ? that.social_security_number == null : this.social_security_number.equals(that.social_security_number));
    equal = equal && (this.evnt_tmestmp == null ? that.evnt_tmestmp == null : this.evnt_tmestmp.equals(that.evnt_tmestmp));
    equal = equal && (this.evnt_oper_id == null ? that.evnt_oper_id == null : this.evnt_oper_id.equals(that.evnt_oper_id));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.student_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.university_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.firstname = JdbcWritableBridge.readString(3, __dbResults);
    this.lastname = JdbcWritableBridge.readString(4, __dbResults);
    this.social_security_number = JdbcWritableBridge.readString(5, __dbResults);
    this.evnt_tmestmp = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.evnt_oper_id = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.student_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.university_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.firstname = JdbcWritableBridge.readString(3, __dbResults);
    this.lastname = JdbcWritableBridge.readString(4, __dbResults);
    this.social_security_number = JdbcWritableBridge.readString(5, __dbResults);
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
    JdbcWritableBridge.writeInteger(student_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(university_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(firstname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lastname, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(social_security_number, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(evnt_tmestmp, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(evnt_oper_id, 7 + __off, 12, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(student_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(university_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(firstname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(lastname, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(social_security_number, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(evnt_tmestmp, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(evnt_oper_id, 7 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.student_id = null;
    } else {
    this.student_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.university_id = null;
    } else {
    this.university_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.firstname = null;
    } else {
    this.firstname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.lastname = null;
    } else {
    this.lastname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.social_security_number = null;
    } else {
    this.social_security_number = Text.readString(__dataIn);
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
    if (null == this.student_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.student_id);
    }
    if (null == this.university_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.university_id);
    }
    if (null == this.firstname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, firstname);
    }
    if (null == this.lastname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lastname);
    }
    if (null == this.social_security_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, social_security_number);
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
    if (null == this.student_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.student_id);
    }
    if (null == this.university_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.university_id);
    }
    if (null == this.firstname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, firstname);
    }
    if (null == this.lastname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, lastname);
    }
    if (null == this.social_security_number) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, social_security_number);
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
    __sb.append(FieldFormatter.escapeAndEnclose(student_id==null?"null":"" + student_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(university_id==null?"null":"" + university_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(firstname==null?"null":firstname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lastname==null?"null":lastname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(social_security_number==null?"null":social_security_number, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(student_id==null?"null":"" + student_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(university_id==null?"null":"" + university_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(firstname==null?"null":firstname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lastname==null?"null":lastname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(social_security_number==null?"null":social_security_number, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.student_id = null; } else {
      this.student_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.university_id = null; } else {
      this.university_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.firstname = null; } else {
      this.firstname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.lastname = null; } else {
      this.lastname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.social_security_number = null; } else {
      this.social_security_number = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.student_id = null; } else {
      this.student_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.university_id = null; } else {
      this.university_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.firstname = null; } else {
      this.firstname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.lastname = null; } else {
      this.lastname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.social_security_number = null; } else {
      this.social_security_number = __cur_str;
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
    student o = (student) super.clone();
    o.evnt_tmestmp = (o.evnt_tmestmp != null) ? (java.sql.Timestamp) o.evnt_tmestmp.clone() : null;
    return o;
  }

  public void clone0(student o) throws CloneNotSupportedException {
    o.evnt_tmestmp = (o.evnt_tmestmp != null) ? (java.sql.Timestamp) o.evnt_tmestmp.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("student_id", this.student_id);
    __sqoop$field_map.put("university_id", this.university_id);
    __sqoop$field_map.put("firstname", this.firstname);
    __sqoop$field_map.put("lastname", this.lastname);
    __sqoop$field_map.put("social_security_number", this.social_security_number);
    __sqoop$field_map.put("evnt_tmestmp", this.evnt_tmestmp);
    __sqoop$field_map.put("evnt_oper_id", this.evnt_oper_id);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("student_id", this.student_id);
    __sqoop$field_map.put("university_id", this.university_id);
    __sqoop$field_map.put("firstname", this.firstname);
    __sqoop$field_map.put("lastname", this.lastname);
    __sqoop$field_map.put("social_security_number", this.social_security_number);
    __sqoop$field_map.put("evnt_tmestmp", this.evnt_tmestmp);
    __sqoop$field_map.put("evnt_oper_id", this.evnt_oper_id);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("student_id".equals(__fieldName)) {
      this.student_id = (Integer) __fieldVal;
    }
    else    if ("university_id".equals(__fieldName)) {
      this.university_id = (Integer) __fieldVal;
    }
    else    if ("firstname".equals(__fieldName)) {
      this.firstname = (String) __fieldVal;
    }
    else    if ("lastname".equals(__fieldName)) {
      this.lastname = (String) __fieldVal;
    }
    else    if ("social_security_number".equals(__fieldName)) {
      this.social_security_number = (String) __fieldVal;
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
    if ("student_id".equals(__fieldName)) {
      this.student_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("university_id".equals(__fieldName)) {
      this.university_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("firstname".equals(__fieldName)) {
      this.firstname = (String) __fieldVal;
      return true;
    }
    else    if ("lastname".equals(__fieldName)) {
      this.lastname = (String) __fieldVal;
      return true;
    }
    else    if ("social_security_number".equals(__fieldName)) {
      this.social_security_number = (String) __fieldVal;
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
