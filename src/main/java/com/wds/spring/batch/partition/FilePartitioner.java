package com.wds.spring.batch.partition;

import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

import java.util.Map;

/**
 * Created by wds on 2015/10/1.
 */
public class FilePartitioner implements Partitioner {
    @Override
    public Map<String, ExecutionContext> partition(int gridSize) {
        return null;
    }
}
