package com.example.client.test;

import com.example.client.entity.Apply;
import com.example.client.entity.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class httpTest {

	public static void main(String[] args) throws JsonProcessingException {
        String url = "http://localhost:8080/home";
        RestTemplate client = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		HttpMethod method = HttpMethod.POST;
		// 以表单的方式提交
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		//将请求头部和参数合成一个请求
		HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<T>(buildApply(), headers);
		//执行HTTP请求，将返回的结构使用ResultVO类格式化
        ResponseEntity<Result> response = client.exchange(url, method, requestEntity, Result.class);

        System.out.println(response.getBody());
	}

	private static String buildApply() throws JsonProcessingException {
		Apply apply = new Apply();
		apply.setId("11");
		apply.setAge("22");
		apply.setName("lisi");
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(apply);
	}
}
