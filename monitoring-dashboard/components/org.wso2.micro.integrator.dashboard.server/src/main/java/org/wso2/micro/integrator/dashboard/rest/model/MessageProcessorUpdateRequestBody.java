package org.wso2.micro.integrator.dashboard.rest.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageProcessorUpdateRequestBody   {
  private @Valid String processorName = null;
  private @Valid String nodeId = null;
  private @Valid Boolean isActive = null;

  /**
   **/
  public MessageProcessorUpdateRequestBody processorName(String processorName) {
    this.processorName = processorName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("processorName")

  public String getProcessorName() {
    return processorName;
  }
  public void setProcessorName(String processorName) {
    this.processorName = processorName;
  }

  /**
   **/
  public MessageProcessorUpdateRequestBody nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("nodeId")

  public String getNodeId() {
    return nodeId;
  }
  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  /**
   **/
  public MessageProcessorUpdateRequestBody isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("isActive")

  public Boolean isIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageProcessorUpdateRequestBody messageProcessorUpdateRequestBody = (MessageProcessorUpdateRequestBody) o;
    return Objects.equals(processorName, messageProcessorUpdateRequestBody.processorName) &&
        Objects.equals(nodeId, messageProcessorUpdateRequestBody.nodeId) &&
        Objects.equals(isActive, messageProcessorUpdateRequestBody.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processorName, nodeId, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageProcessorUpdateRequestBody {\n");
    
    sb.append("    processorName: ").append(toIndentedString(processorName)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
