package com.techtalentsouth.techtalentblog.blogpost;

import org.springframework.data.repository.CrudRepository;

// the repository represents the database table itself
// where CRUD OCCURS
//defining an interface not a class
//JPA IS INTERESTED IN HOW OR WHY
//TABLE IS ACCESSED  SPECIFICATON ON HOW/WHY DB IS ACCESSED
// JPA WRITES AND CREATES THE CLASS
//HAVE TO INHERIT FROM REPOSITORY INTERFACE [DIRECTLY OR INDIRECTLY]

public interface BlogPostRepository extends CrudRepository<BlogPost,Long> {

	//can add additional queries that we want to perform.
	
	
}
