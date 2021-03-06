package krystianciamaga.com.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "abstract",type="asset")
public class Asset  {

    @Id
    private String id;

    private String name;
    private String category;
}
