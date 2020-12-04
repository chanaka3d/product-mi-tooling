package rest.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;
import javax.validation.Valid;

public class LogConfigAddRequestBody   {
  private @Valid String loggerName = null;
  private @Valid String className = null;
public enum LevelEnum {

    FALSE(String.valueOf("false")), TRACE(String.valueOf("Trace")), DEBUG(String.valueOf("DEBUG")), INFO(String.valueOf("INFO")), WARN(String.valueOf("WARN")), ERROR(String.valueOf("ERROR")), FATAL(String.valueOf("FATAL"));


    private String value;

    LevelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static LevelEnum fromValue(String v) {
        for (LevelEnum b : LevelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private @Valid LevelEnum level = null;

  /**
   **/
  public LogConfigAddRequestBody loggerName(String loggerName) {
    this.loggerName = loggerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("loggerName")

  public String getLoggerName() {
    return loggerName;
  }
  public void setLoggerName(String loggerName) {
    this.loggerName = loggerName;
  }

  /**
   **/
  public LogConfigAddRequestBody className(String className) {
    this.className = className;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("className")

  public String getClassName() {
    return className;
  }
  public void setClassName(String className) {
    this.className = className;
  }

  /**
   **/
  public LogConfigAddRequestBody level(LevelEnum level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("level")

  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogConfigAddRequestBody logConfigAddRequestBody = (LogConfigAddRequestBody) o;
    return Objects.equals(loggerName, logConfigAddRequestBody.loggerName) &&
        Objects.equals(className, logConfigAddRequestBody.className) &&
        Objects.equals(level, logConfigAddRequestBody.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loggerName, className, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogConfigAddRequestBody {\n");

    sb.append("    loggerName: ").append(toIndentedString(loggerName)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
