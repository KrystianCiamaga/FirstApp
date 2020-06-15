package krystianciamaga.com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "content",type = "trade")
public class Trade extends AbstractContent {
    private Double notional;
    private String state;
    private String clientName;
}

