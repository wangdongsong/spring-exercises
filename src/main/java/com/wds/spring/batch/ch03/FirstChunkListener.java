package com.wds.spring.batch.ch03;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

/**
 * Created by wds on 2015/10/1.
 */
public class FirstChunkListener implements ChunkListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(FirstChunkListener.class);

    @Override
    public void beforeChunk(ChunkContext context) {
        LOGGER.info("FirstChunkListener before Chunk");
    }

    @Override
    public void afterChunk(ChunkContext context) {
        LOGGER.info("FirstChunkListener after Chunk");
    }

    @Override
    public void afterChunkError(ChunkContext context) {
        LOGGER.error(context.getStepContext().getStepName());
    }
}
