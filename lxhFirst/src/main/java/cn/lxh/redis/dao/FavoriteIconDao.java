package cn.lxh.redis.dao;

/**
* <p>Title: FavoriteIconDao</p>
* <p>Description: </p>
* <p>Company: zhph</p> 
* @author liaoxinghan
* @date 2016-12-30
*/
public interface FavoriteIconDao {

	public boolean put(String key, String value);

	public String get(String key);
}
