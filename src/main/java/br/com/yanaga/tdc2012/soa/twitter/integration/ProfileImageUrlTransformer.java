package br.com.yanaga.tdc2012.soa.twitter.integration;

import org.springframework.integration.annotation.Transformer;

public class ProfileImageUrlTransformer {

	@Transformer
	public String transform(String url) {
		int lastIndexOf = url.lastIndexOf("_normal");
		if (lastIndexOf != -1) {
			return String.format("%s%s", url.substring(0, lastIndexOf),
					url.substring(lastIndexOf + 7));
		}
		return url;
	}

}