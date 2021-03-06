package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	public static void main(final String[] args) {
		showStoreData();
	}

	public static void showStoreData()
	{
		System.out.printf("%s\n",NOME_LOJA);
		System.out.printf("%s, %d %s\n",LOGRADOURO,NUMERO,COMPLEMENTO);
		System.out.printf("%s - %s - %s\n",BAIRRO,MUNICIPIO,ESTADO);
		System.out.printf("CEP:%s Tel %s\n",CEP,TELEFONE);
		System.out.printf("%s\n",OBSERVACAO);
		System.out.printf("CNPJ: %s\n",CNPJ);
		System.out.printf("IE: %s\n",INSCRICAO_ESTADUAL);
	}

}
