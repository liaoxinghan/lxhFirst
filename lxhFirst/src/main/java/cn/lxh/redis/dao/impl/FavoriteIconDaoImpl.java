package cn.lxh.redis.dao.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Repository;

import cn.lxh.redis.dao.FavoriteIconDao;

/**
* <p>Title: FavoriteIconDaoImpl</p>
* <p>Description: </p>
* <p>Company: zhph</p> 
* @author liaoxinghan
* @date 2016-12-30
*/
@Repository
public class FavoriteIconDaoImpl implements FavoriteIconDao {

	@Resource
	private RedisTemplate<Serializable, Serializable> redisTemplate;

	@Override
	public boolean put(final String key, final String value) {
		boolean result = redisTemplate.execute(new RedisCallback<Boolean>() {
			public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
				RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
				byte[] putKey = serializer.serialize(key);
				byte[] putVal = serializer.serialize(value);
				return connection.setNX(putKey, putVal);
			}
		});
		return result;
	}

	@Override
	public String get(String key) {
		return key;

	}

}
