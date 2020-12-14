package com.republish.model;

import java.util.Date;

public class Comment {
	
	private long commentId;
	private User userId;
	private String comment;
	private Date createdTimeStamp;
	private Date updatedTimeStamp;
	
	public Comment() {}
	
	public Comment(long commentId, User userId, String comment, Date createdTimeStamp, Date updatedTimeStamp) {
		super();
		this.commentId = commentId;
		this.userId = userId;
		this.comment = comment;
		this.createdTimeStamp = createdTimeStamp;
		this.updatedTimeStamp = updatedTimeStamp;
	}
	
	public long getCommentId() {
		return commentId;
	}
	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}
	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}
	public Date getUpdatedTimeStamp() {
		return updatedTimeStamp;
	}
	public void setUpdatedTimeStamp(Date updatedTimeStamp) {
		this.updatedTimeStamp = updatedTimeStamp;
	}
	
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", userId=" + userId + ", comment=" + comment + ", createdTimeStamp="
				+ createdTimeStamp + ", updatedTimeStamp=" + updatedTimeStamp + "]";
	}
	
}
