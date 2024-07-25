package edu.training.osttra.second_version.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResponseTableNameDto {

    private String displayName;
    private String key;

    public String toString()
    {
        return "{displayName:"+displayName+",key:"+key+"}";
    }
}
