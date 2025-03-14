package datawave.microservice.ingest.adapter;

import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class ManifestOutputFormat<K,V> extends TextOutputFormat<K,V> {
    @Override
    public Path getDefaultWorkFile(TaskAttemptContext context, String extension) throws IOException {
        return super.getDefaultWorkFile(context, extension.equals("") ? ".manifest" : ".manifest" + extension);
    }
}
