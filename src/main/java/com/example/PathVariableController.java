package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by scottyvg on 2/23/17.
 */
@RestController
public class PathVariableController {

    @GetMapping("/individual-example/{q}/{from}") // matches /individual-example/foo/bar
    public String getIndividualParams(@PathVariable String from, @PathVariable("q") String query) {
        return String.format("q:%s from:%s", query, from);
    }

    @GetMapping("/tasks/{taskId}/comments/{commentId}")
    public String getCommentsForTask(@PathVariable int taskId, @PathVariable int commentId) {
        return String.format("taskId is %d; commentId is %d", taskId, commentId);
    }

    @GetMapping("/test/tasks/{taskId}/comments/{commentId}")
    public String getCommentsForTask(@PathVariable Map pathVariables) {
        return pathVariables.toString(); // {taskId=46, commentId=35}
    }

    public class TaskIds {
        private int taskId;
        private int commentId;

        public int getTaskId() { return taskId; }

        public void setTaskId(int taskId) { this.taskId = taskId; }

        public int getCommentId() { return commentId; }

        public void setCommentId(int commentId) { this.commentId = commentId; }
    }
    
    @GetMapping("/test/tasks/{taskId}/comments/{commentId}")
    public String getCommentsForTask(TaskIds ids) {
        return String.format("taskId is %d; commentId is %s", ids.getTaskId(), ids.getCommentId());
    }

}
