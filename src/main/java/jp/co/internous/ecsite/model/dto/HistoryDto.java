package jp.co.internous.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.domain.TblPurchase;


//表示したいフィールド（変更可能)を設定したクラス
//複数テーブルからフィールドを設定できる
public class HistoryDto {
	private int id;
	private int userId;
	private int goodsId;
	private String goodsName;
	private int itemCount;
	private int total;
	private String createdAt;
	
	public HistoryDto() {}
	
	public HistoryDto(TblPurchase entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.goodsId = entity.getGoodsId();
		this.goodsName = entity.getGoodsName();
		this.itemCount = entity.getItemCount();
		this.total = entity.gettotal();
		Timestamp d = entity.getCreatedAt();
		//Timestamp型はsqlだとdatetime型に対応する
		//最近はjava.time.LocalDateTimeの使用が推奨されている
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.createdAt = f.format(d);
		//パターン.format(取得した日時)を文字列に変換
	}
	
	  public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    
	    public int getUserId() {
	        return userId;
	    }

	    public void setUserId(int userId) {
	        this.userId = userId;
	    }

	    
	    public int getGoodsId() {
	        return goodsId;
	    }

	    public void setGoodsId(int goodsId) {
	        this.goodsId = goodsId;
	    }

	    	    public String getGoodsName() {
	        return goodsName;
	    }

	    public void setGoodsName(String goodsName) {
	        this.goodsName = goodsName;
	    }

	    	    public int getItemCount() {
	        return itemCount;
	    }

	    public void setItemCount(int itemCount) {
	        this.itemCount = itemCount;
	    }

	    	    public int getTotal() {
	        return total;
	    }

	    public void setTotal(int total) {
	        this.total = total;
	    }

	    	    public String getCreatedAt() {
	        return createdAt;
	    }

	    public void setCreatedAt(String createdAt) {
	        this.createdAt = createdAt;
	    }
	}

