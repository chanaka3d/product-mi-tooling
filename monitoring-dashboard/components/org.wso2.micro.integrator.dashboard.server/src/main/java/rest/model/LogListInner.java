package rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;

public class LogListInner   {
  private @Valid String logFileName = null;
  private @Valid List<Object> nodes = new ArrayList<Object>();

  /**
   **/
  public LogListInner logFileName(String logFileName) {
    this.logFileName = logFileName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("logFileName")

  public String getLogFileName() {
    return logFileName;
  }
  public void setLogFileName(String logFileName) {
    this.logFileName = logFileName;
  }

  /**
   **/
  public LogListInner nodes(List<Object> nodes) {
    this.nodes = nodes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nodes")

  public List<Object> getNodes() {
    return nodes;
  }
  public void setNodes(List<Object> nodes) {
    this.nodes = nodes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogListInner logListInner = (LogListInner) o;
    return Objects.equals(logFileName, logListInner.logFileName) &&
        Objects.equals(nodes, logListInner.nodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logFileName, nodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogListInner {\n");

    sb.append("    logFileName: ").append(toIndentedString(logFileName)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
