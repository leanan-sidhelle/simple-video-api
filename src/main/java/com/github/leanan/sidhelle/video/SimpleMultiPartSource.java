/**
 * This is free and unencumbered software released into the public domain.
 * 
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 * 
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 * 
 * For more information, please refer to <http://unlicense.org/>
 */
package com.github.leanan.sidhelle.video;

import java.util.concurrent.TimeUnit;

import org.bytedeco.ffmpeg.avformat.AVStream;
import org.bytedeco.ffmpeg.avutil.AVFrame;

/**
 * TODO:
 *
 */
public class SimpleMultiPartSource implements MultiPartSource {

	@Override
	public AVFrame remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AVFrame element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AVFrame poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AVFrame poll(long timeout, TimeUnit unit) throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AVFrame peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AVFrame take() throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nb_streams() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AVStream stream(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSource(FrameSource source) {
		// TODO Auto-generated method stub

	}

}
