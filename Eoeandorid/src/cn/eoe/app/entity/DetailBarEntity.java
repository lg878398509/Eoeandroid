package cn.eoe.app.entity;
/**
 * 动�?显示详情页面的操作栏实体�?
 * @author wangxin
 *
 */
public class DetailBarEntity {
	
	private UserLikeEntity userlike;
	private CommentEntity	comment;
	private String	favorite;
	public UserLikeEntity getUserlike() {
		return userlike;
	}
	public void setUserlike(UserLikeEntity userlike) {
		this.userlike = userlike;
	}
	public CommentEntity getComment() {
		return comment;
	}
	public void setComment(CommentEntity comment) {
		this.comment = comment;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	
	
	
	

}
