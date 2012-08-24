package br.com.yanaga.tdc2012.soa.twitter.web;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import br.com.yanaga.tdc2012.soa.twitter.integration.Repository;

import com.google.common.collect.ImmutableList;

@Controller
public class ImagemController {

	@Inject
	private Repository repository;

	public List<String> getImagens() {
		return ImmutableList.copyOf(repository.getImagens());
	}

}