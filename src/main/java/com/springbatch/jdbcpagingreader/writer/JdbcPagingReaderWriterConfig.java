package com.springbatch.jdbcpagingreader.writer;

import com.springbatch.jdbcpagingreader.dominio.Transacao;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbatch.jdbcpagingreader.dominio.Cliente;

@Configuration
public class JdbcPagingReaderWriterConfig {
	@Bean
	public ItemWriter<Transacao> jdbcPagingWriter() {
		return transacao-> transacao.forEach(System.out::println);
	}
}
