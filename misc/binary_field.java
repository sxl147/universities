// ORM class for table 'binary_field'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jul 22 15:20:12 PDT 2017
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

public class binary_field extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer binary_field_id;
  public Integer get_binary_field_id() {
    return binary_field_id;
  }
  public void set_binary_field_id(Integer binary_field_id) {
    this.binary_field_id = binary_field_id;
  }
  public binary_field with_binary_field_id(Integer binary_field_id) {
    this.binary_field_id = binary_field_id;
    return this;
  }
  private org.apache.hadoop.io.BytesWritable binary_field_bits;
  public org.apache.hadoop.io.BytesWritable get_binary_field_bits() {
    return binary_field_bits;
  }
  public void set_binary_field_bits(org.apache.hadoop.io.BytesWritable binary_field_bits) {
    this.binary_field_bits = binary_field_bits;
  }
  public binary_field with_binary_field_bits(org.apache.hadoop.io.BytesWritable binary_field_bits) {
    this.binary_field_bits = binary_field_bits;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof binary_field)) {
      return false;
    }
    binary_field that = (binary_field) o;
    boolean equal = true;
    equal = equal && (this.binary_field_id == null ? that.binary_field_id == null : this.binary_field_id.equals(that.binary_field_id));
    equal = equal && (this.binary_field_bits == null ? that.binary_field_bits == null : this.binary_field_bits.equals(that.binary_field_bits));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof binary_field)) {
      return false;
    }
    binary_field that = (binary_field) o;
    boolean equal = true;
    equal = equal && (this.binary_field_id == null ? that.binary_field_id == null : this.binary_field_id.equals(that.binary_field_id));
    equal = equal && (this.binary_field_bits == null ? that.binary_field_bits == null : this.binary_field_bits.equals(that.binary_field_bits));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.binary_field_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.binary_field_bits = JdbcWritableBridge.readBytesWritable(2, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.binary_field_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.binary_field_bits = JdbcWritableBridge.readBytesWritable(2, __dbResults);
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
    JdbcWritableBridge.writeInteger(binary_field_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(binary_field_bits, 2 + __off, -3, __dbStmt);
    return 2;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(binary_field_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBytesWritable(binary_field_bits, 2 + __off, -3, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.binary_field_id = null;
    } else {
    this.binary_field_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.binary_field_bits = null;
    } else {
    this.binary_field_bits = new BytesWritable();
    this.binary_field_bits.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.binary_field_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.binary_field_id);
    }
    if (null == this.binary_field_bits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    this.binary_field_bits.write(__dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.binary_field_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.binary_field_id);
    }
    if (null == this.binary_field_bits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    this.binary_field_bits.write(__dataOut);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 94, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(binary_field_id==null?"null":"" + binary_field_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(binary_field_bits==null?"null":"" + binary_field_bits, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(binary_field_id==null?"null":"" + binary_field_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(binary_field_bits==null?"null":"" + binary_field_bits, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 94, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.binary_field_id = null; } else {
      this.binary_field_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.binary_field_bits = null; } else {
      String[] strByteVal = __cur_str.trim().split(" ");
      byte [] byteVal = new byte[strByteVal.length];
      for (int i = 0; i < byteVal.length; ++i) {
          byteVal[i] = (byte)Integer.parseInt(strByteVal[i], 16);
      }
      this.binary_field_bits = new BytesWritable(byteVal);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.binary_field_id = null; } else {
      this.binary_field_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.binary_field_bits = null; } else {
      String[] strByteVal = __cur_str.trim().split(" ");
      byte [] byteVal = new byte[strByteVal.length];
      for (int i = 0; i < byteVal.length; ++i) {
          byteVal[i] = (byte)Integer.parseInt(strByteVal[i], 16);
      }
      this.binary_field_bits = new BytesWritable(byteVal);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    binary_field o = (binary_field) super.clone();
    o.binary_field_bits = (o.binary_field_bits != null) ? new BytesWritable(Arrays.copyOf(binary_field_bits.getBytes(), binary_field_bits.getLength())) : null;
    return o;
  }

  public void clone0(binary_field o) throws CloneNotSupportedException {
    o.binary_field_bits = (o.binary_field_bits != null) ? new BytesWritable(Arrays.copyOf(binary_field_bits.getBytes(), binary_field_bits.getLength())) : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("binary_field_id", this.binary_field_id);
    __sqoop$field_map.put("binary_field_bits", this.binary_field_bits);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("binary_field_id", this.binary_field_id);
    __sqoop$field_map.put("binary_field_bits", this.binary_field_bits);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("binary_field_id".equals(__fieldName)) {
      this.binary_field_id = (Integer) __fieldVal;
    }
    else    if ("binary_field_bits".equals(__fieldName)) {
      this.binary_field_bits = (org.apache.hadoop.io.BytesWritable) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("binary_field_id".equals(__fieldName)) {
      this.binary_field_id = (Integer) __fieldVal;
      return true;
    }
    else    if ("binary_field_bits".equals(__fieldName)) {
      this.binary_field_bits = (org.apache.hadoop.io.BytesWritable) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
