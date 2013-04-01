package org.openlmis.rnr.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import static org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion.NON_EMPTY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(include = NON_EMPTY)
public class Comment {

  private Integer id;
  private Integer rnrId;
  private Integer authorId;
  private String commentText;

}
