package org.udg.pds.springtodo.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.udg.pds.springtodo.serializer.JsonTagSerializer;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsonSerialize(using = JsonTagSerializer.class)
@Entity(name="user_group")
public class Group  implements Serializable {

        /**
         * Default value included to remove warning. Remove or modify at will.
         **/
        private static final long serialVersionUID = 1L;

      public Group() {
        }

      public Group(String name, String description) {
            this.name = name;
            this.description = description;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
      @NotNull
      String name;
      String description;

}
