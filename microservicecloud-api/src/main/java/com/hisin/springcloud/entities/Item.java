package com.hisin.springcloud.entities;

/**
 * 	商品实体
 * @author Hisin
 *
 */
public class Item {
	
//	  `id` bigint(20) NOT NULL COMMENT '商品id，同时也是商品编号',
//	  `title` varchar(100) NOT NULL COMMENT '商品标题',
//	  `sell_point` varchar(500) DEFAULT NULL COMMENT '商品卖点',
//	  `price` bigint(20) NOT NULL COMMENT '商品价格，单位为：分',
//	  `num` int(10) NOT NULL COMMENT '库存数量',
//	  `barcode` varchar(30) DEFAULT NULL COMMENT '商品条形码',
//	  `image` varchar(500) DEFAULT NULL COMMENT '商品图片',
//	  `cid` bigint(10) NOT NULL COMMENT '所属类目，叶子类目',
//	  `status` tinyint(4) NOT NULL DEFAULT '1' COMMENT '商品状态，1-正常，2-下架，3-删除',
//	  `created` datetime NOT NULL COMMENT '创建时间',
//	  `updated` datetime NOT NULL COMMENT '更新时间',
	
	private Long id; 
	private String title; 
	private String sellPoint;
	private String privce;
	private Integer num;
	private String barcode;
	private String image;
	private String cid;
	private String status;
	private String created;
	private String updated;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSellPoint() {
		return sellPoint;
	}
	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}
	public String getPrivce() {
		return privce;
	}
	public void setPrivce(String privce) {
		this.privce = privce;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((barcode == null) ? 0 : barcode.hashCode());
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		result = prime * result + ((privce == null) ? 0 : privce.hashCode());
		result = prime * result + ((sellPoint == null) ? 0 : sellPoint.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (barcode == null) {
			if (other.barcode != null)
				return false;
		} else if (!barcode.equals(other.barcode))
			return false;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		if (privce == null) {
			if (other.privce != null)
				return false;
		} else if (!privce.equals(other.privce))
			return false;
		if (sellPoint == null) {
			if (other.sellPoint != null)
				return false;
		} else if (!sellPoint.equals(other.sellPoint))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", sellPoint=" + sellPoint + ", privce=" + privce + ", num="
				+ num + ", barcode=" + barcode + ", image=" + image + ", cid=" + cid + ", status=" + status
				+ ", created=" + created + ", updated=" + updated + "]";
	}
	public Item(Long id, String title, String sellPoint, String privce, Integer num, String barcode, String image,
			String cid, String status, String created, String updated) {
		super();
		this.id = id;
		this.title = title;
		this.sellPoint = sellPoint;
		this.privce = privce;
		this.num = num;
		this.barcode = barcode;
		this.image = image;
		this.cid = cid;
		this.status = status;
		this.created = created;
		this.updated = updated;
	}
	public Item() {
		super();
	}
	
	
}
