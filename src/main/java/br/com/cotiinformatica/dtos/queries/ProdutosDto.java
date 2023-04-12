package br.com.cotiinformatica.dtos.queries;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "produtos")
public class ProdutosDto {
	@Id
	private Integer Id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private Integer quatidade;
	private CategoriasDto categoria;
	

}