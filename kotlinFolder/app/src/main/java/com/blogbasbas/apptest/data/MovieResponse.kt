package com.blogbasbas.apptest.data

/**
 * Created by Server on 26/08/2017.
 */
data class MovieResponse (val page : Int,
                          val total_result :Long,
                          val total_pages : Long,
                          val result: List<Result>)
{

    data class Result (val  id : Int,
                       val title : String,
                       val overview : String,
                       )


}