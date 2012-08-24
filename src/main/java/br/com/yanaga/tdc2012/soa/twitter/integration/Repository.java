package br.com.yanaga.tdc2012.soa.twitter.integration;

import java.util.List;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;

@Component
public class Repository {

	private List<String> imagens = Lists.newArrayListWithCapacity(20);

	@ServiceActivator
	public void print(String url) {
		if (imagens.size() == 20) {
			imagens.remove(19);
		}
		imagens.add(url);
	}

	public List<String> getImagens() {
		return imagens;
	}

}